targetConfigurations = [
        'x64Mac'        : [
                'temurin'
        ],
        'x64Linux'      : [
                'temurin'
        ],
        'x64AlpineLinux' : [
                'temurin'
        ],
        'x32Windows'    : [
                'temurin'
        ],
        'x64Windows'    : [
                'temurin'
        ],
        'ppc64Aix'      : [
                'temurin'
        ],
        'ppc64leLinux'  : [
                'temurin'
        ],
        'aarch64Linux'  : [
                'temurin'
        ],
        'arm32Linux'  : [
                'temurin'
        ],
        'x64Solaris': [
                'temurin'
        ],
        'sparcv9Solaris': [
                'temurin'
        ]
]

// scmReferences to use for weekly release build
weekly_release_scmReferences = [
        'temurin'        : ''
]

return this
