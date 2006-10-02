# -*- coding: iso-8859-1 -*-
"""MoinMoin Desktop Edition (MMDE) - Configuration

ONLY to be used for MMDE - if you run a personal wiki on your notebook or PC.

This is NOT intended for internet or server or multiuser use due to relaxed security settings!
"""

from MoinMoin.multiconfig import DefaultConfig

class Config(DefaultConfig):
    # vvv DON'T TOUCH THIS EXCEPT IF YOU KNOW WHAT YOU DO vvv
    moinmoin_dir = os.path.abspath(os.path.normpath(os.path.dirname(sys.argv[0])))
    data_dir = os.path.join(moinmoin_dir, 'wiki', 'data')
    data_underlay_dir = os.path.join(moinmoin_dir, 'wiki', 'underlay')

    DesktopEdition = True # give all local users full powers
    acl_rights_default = u"All:read,write,delete,revert,admin"
    sitename = u'MoinMoin DesktopEdition'
    logo_string = u'<img src="/wiki/common/moinmoin.png" alt="MoinMoin Logo">'
    page_front_page = u'FrontPage' # change to some better value
    page_credits = [
        '<a href="http://moinmoin.wikiwikiweb.de/">MoinMoin DesktopEdition Powered</a>',
        '<a href="http://www.python.org/">Python Powered</a>',
    ]
    # ^^^ DON'T TOUCH THIS EXCEPT IF YOU KNOW WHAT YOU DO ^^^

