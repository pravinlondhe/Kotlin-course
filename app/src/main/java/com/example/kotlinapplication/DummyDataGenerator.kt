package com.example.kotlinapplication

import com.example.kotlinapplication.components.User

fun getSampleUsers() = listOf(
    User(R.drawable.ic_person, NED, IMAGE1),
    User(R.drawable.ic_person_1, BRYAN, IMAGE2),
    User(R.drawable.ic_person_2, ARYA, IMAGE3),
    User(R.drawable.ic_person_3, SANSA, IMAGE4),
    User(R.drawable.ic_person, NED, IMAGE1),
    User(R.drawable.ic_person_1, BRYAN, IMAGE2),
    User(R.drawable.ic_person_2, ARYA, IMAGE3),
    User(R.drawable.ic_person_3, SANSA, IMAGE4),
    User(R.drawable.ic_person, NED, IMAGE1),
    User(R.drawable.ic_person_1, BRYAN, IMAGE2),
    User(R.drawable.ic_person_2, ARYA, IMAGE3),
    User(R.drawable.ic_person_3, SANSA, IMAGE4),
    User(R.drawable.ic_person, NED, IMAGE1),
    User(R.drawable.ic_person_1, BRYAN, IMAGE2),
    User(R.drawable.ic_person_2, ARYA, IMAGE3),
    User(R.drawable.ic_person_3, SANSA, IMAGE4)

    )

private const val ARYA = "Arya Stark"
private const val NED = "Ned Stark"
private const val BRYAN = "Bryan Stark"
private const val SANSA = "Sansa Stark"
private const val IMAGE1 =
    "https://www.clipartmax.com/png/middle/46-467745_cartoon-avatar-portrait-of-man-avatar-icon.png"
private const val IMAGE2 =
    "https://www.clipartmax.com/png/middle/248-2487966_matthew-man-avatar-icon-png.png"
private const val IMAGE3 =
    "https://www.clipartmax.com/png/middle/21-214382_female-clipart-transparent-female-avatar.png"
private const val IMAGE4 =
    "https://www.clipartmax.com/png/middle/21-214515_female-woman-cartoon-avatar-avatar-female-doctor.png"