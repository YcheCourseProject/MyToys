__author__ = 'cheyulin'

import urllib2
from StringIO import StringIO
from bs4 import BeautifulSoup
import gzip
import re


def loadData(url):
    request = urllib2.Request(url)
    request.add_header('Accept-encoding', 'gzip')
    response = urllib2.urlopen(request)
    print response.info().get('Content-Encoding')
    if response.info().get('Content-Encoding') == 'gzip':
        print 'response data is in gzip format.'
        buf = StringIO(response.read())
        f = gzip.GzipFile(fileobj=buf)
        data = f.read()
    else:
        data = response.read()
    return data


if __name__ == '__main__':
    page = loadData('http://www.vldb.org/2015/program/lib/FullProgram.html#D1F1045T1215R5')
    soup = BeautifulSoup(page, from_encoding='GB18030')
    paper_info = soup.find_all('div', {'class': 'booklet_paper_folded'});
    for paper in paper_info:
        info = paper.findAll('strong')
        title = info[0]
        if (re.match(r'.*Graph.*', str(title))):
            print title
            # print soup.prettify().encode('GB18030')
