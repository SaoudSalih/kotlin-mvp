package ssa.abc.alrais.basekotlin.app


/**
 * Created by saoud on 10/6/17.
 */
object GlobalConstants {

    //Permissions

    val STORAGE_PERMISSION_REQUEST_CODE = 103
    val READ_CONTACTS_PERMISSION_REQUEST_CODE = 104
    val READ_GSERVICES_PERMISSION_REQUEST_CODE = 105
    val CAMERA_PERMISSION_REQUEST_CODE = 106
    val ACCESS_FINE_LOCATION_PERMISSION_REQUEST_CODE = 107
    val REQUEST_SMS_WRITE_PERMISSION = 112
    val REQUEST_SMS_READ_PERMISSION = 101
    val REQUEST_SMS_RECEIVE_PERMISSION = 113
    val REQUEST_ACCESS_CAMERA = 102
    val REQUEST_ACCESS_LOCATION = 107
    val REQUEST_ACCESS_CATEGORY_CAMERA = 108
    val REQUEST_ACCESS_CATEGORY_STORAGE = 109
    val REQUEST_PERMISSION_READ_STORAGE_CODE = 110
    val REQUEST_PERMISSION_CALL_CODE = 120
    val SDK_INT_MARSHMALLOW = 23
    val DIRECTORY_IMAGE = "Images"


    var SPLASH_TIME_OUT = 2000
    var SPECIAL_TIME_OUT = 3000
    val STORAGE_PERMISSION_REQUEST_MESSAGE = "Writing Storage permission is required"
    val CAMERA_PERMISSION_REQUEST_MESSAGE = "Camera permission is required"
    val REQUEST_PERMISSION_READ_STORAGE_MESSAGE = "Storage permission is required"
    val READ_SMS_PERMISSION_MESSAGE = "SMS read permission is required"
    val WRITE_SMS_PERMISSION_MESSAGE = "SMS write permission is required"
    val RECEIVE_SMS_PERMISSION_MESSAGE = "SMS receive permission is required"
    val REQUEST_PERMISSION_CALL = "Call action permission required"


    val AUTH_KEY_PATTERN = "|"
    val URL_PATTERN = "/"
    val WEB_APP_URL = "/bodhiinfo/quest/yet/bodhiinfo/yet/jack/bodhiinfo/zoo/yet/or/bodhiinfo/quest/yet/diversion/bodhiinfo/quest/yet/goalinfo/yet/cloud/yet/helpline"
    val DB_PATTERN = "-"
    val DB_KEY = "-yet-yet-yet-zoo-bodhiinfo-veeble-yet-bodhiinfo-yet-veeble-bodhiinfo-cloud-bodhiinfo-bodhiinfo-yet-zoo-yet-goalinfo-yet-network-yet-or"
    val USER_AUTH_KEY = "USER_AUTH_KEY"

    val HOME_DATA_FILE = "readonlySystemfile.ser"
    val USER_PREFS = "USER_PREFS"
    val USER_LOCATION = "USER_LOCATION"
    val USER_NAME = "USER_NAME"
    val USER_REFERAL_ID = "USER_REFERAL_ID"
    val SUCCESS = "Success"
    val FAILED = "Failed"
    val USER_ALREADY_EXIST = ""
    val USER_MOBILE = "USER_MOBILE"
    val FIRSTNAME = "First name"
    val PROFILE_EDIT = "Profile Editing"
    val UPDATING = "updating ..."
    val UPDATE = "UPDATE"
    val CANCELING = "CANCELING ..."
    val CANCEL = "CANCEL"
    val QUIZ_WINNER = "WINNER"
    val QUIZ_ATTENDED = "ATTENDED"
    val QUIZ_RIGHT_ANSWER = "RIGHT_ANSWER"
    val QUIZ_WRONG_ANSWER = "WRONG_ANSWER"
    //Bundle variables
    val PROFILE_DATA = "PROFILE_DATA"

    // LOCAL DATABASE TABLES
    val TABLE_LOCATION = "tbl_location"
    val TABLE_SUB_LOCATION = "tbl_sub_location"
    val TABLE_USER = "tbl_user"
    val TABLE_SHOP = "tbl_shop"
    val TABLE_SHOP_CATEGORY = "tbl_shop_category"
    val TABLE_SHOP_IMAGE = "tbl_shop_image"
    val TABLE_SHOP_RATING = "tbl_shop_rating"
    val TABLE_TAXI_CATEGORY = "tbl_taxi_category"
    val TABLE_TAXI = "tbl_taxi"
    val TABLE_EMERGENCY_CATEGORY = "tbl_emergency_category"
    val TABLE_EMERGENCY = "tbl_emergency"
    val TABLE_HOSPITAL_CATEGORY = "tbl_hospital_category"
    val TABLE_HOSPITAL = "tbl_hospital"
    val TABLE_HOSPITAL_DEPARTMENT = "tbl_hospital_department"
    val TABLE_DOCTOR = "tbl_doctor"
    val TABLE_EDUCATIONAL_INSTITUTION_TYPE = "tbl_educational_institution_type"
    val TABLE_EDUCATIONAL_INSTITUTION = "tbl_educational_institution"
    val TABLE_EDUCATIONAL_INSTITUTION_COURSE = "tbl_educational_institution_course"
    val TABLE_EDUCATIONAL_INSTITUTION_IMAGE = "tbl_educational_institution_image"
    val TABLE_PANIKKAR_TYPE = "tbl_panikkar_type"
    val TABLE_PANIKKAR = "tbl_panikkar"
    val TABLE_PANIKAL = "tbl_panikal"
    val TABLE_ASSOCIATION_TYPE = "tbl_association_type"
    val TABLE_ASSOCIATION = "tbl_association"
    val TABLE_NEWS = "tbl_news"
    val TABLE_BREAKING_NEWS = "tbl_breaking_news"
    val TABLE_EVENT = "tbl_event"
    val TABLE_BLOOD_BANK = "tbl_blood_bank"
    val TABLE_GOVERNMENT_OFFICE = "tbl_government_office"
    val TABLE_BUS_TIME = "tbl_bus_time"
    val TABLE_HOTSPOT = "tbl_hotspot"
    val TABLE_HOTSPOT_IMAGE = "tbl_hotspot_image"
    val TABLE_SELL = "tbl_sell"
    val TABLE_TODAY_SPECIAL_CATEGORY = "tbl_today_special_category"
    val TABLE_TODAY_SPECIAL = "tbl_today_special"
    val TABLE_QUIZ = "tbl_quiz"
    val TABLE_QUIZ_QUESTION = "tbl_quiz_question"
    val TABLE_QUIZ_ANSWER = "tbl_quiz_answer"
    val TABLE_QUIZ_WINNER = "tbl_quiz_winner"
    val TABLE_JOB_OPENINGS = "tbl_job_opening"
    val TABLE_CRASH = "tbl_crash"
    val TABLE_OFFER = "tbl_offer"
    val TABLE_JOB_CATEGORY = "tbl_job_category"
    val TABLE_SELL_CATEGORY = "tbl_sell_category"
    val ON_UPLOAD = "Waiting For Approval"


    // Drawer items

    //URLs
    val ADDNEWS = "addNews.php"
    val ADDSELLS = "addSell.php"
    val ADDEVENT = "addEvent.php"
    val ADDHOTSPOT = "addHotSpot.php"
    val ADDJOB = "addJob.php"
    val ADDPROFILE = "updateProfile.php"

    //Bundle
    val DATA = "DATA"
    val OTP = "otp"
    val DESCLAIMER = "DESCLAIMER"
    val SHOW = "SHOW"


    //Retrofit params
    val OTP_PARAM_MOBILE = "mobile"
    val OTP_VARIFY_PARAM = "otp"
    val AUTHENTICATION = "authentication"
    val REFERRAL_ID = "referralId"
    val MOBILE = "mobile"
    val SEARCH_CONTENT = "content"
    val NOT_PUBLISHED = "Winner is not published yet"

    val IMAGE_BASE_URL = "http://bodhiinfo.com/demo/test_angadi/"

    //Toolbar heading
    val TB_REFERRAL_ID_STATUS = "Referral ID status"
    val COMMENT = "Your comment"


    //Toast messages
    val INTERNAL_SERVER_ERROR = "Internal server error"
    val NO_INTERNET = "No internet connection"
    val NO_DATA = "No data found"
    val WINNERS = "Winners"
    val NO_DATA_GALLERY = "No images are available in the gallery."
    val FAILED_COMMUNICATION = "Communication failed"

    //Back button configs

    var VIEW_IMPL_PATH = "class com.entenadu.enteangadi.view.fragment.viewimplementation."
    var HOMEFRAGMENT = "HomeFragment"
    var EMERGENCYFRAGMENT = "EmergencyFragment"
    var EDUCATIONFRAGMENT = "EducationFragment"
    var PANIKKARFRAGMENT = "PanikkarFragment"
    var JOBOPENINGFRAGMENT = "JobOpeningsFragment"
    var TAXIFRAGMENT = "TaxiFragment"
    var SHOPFRAGMENT = "ShopFragment"
    var DOCTORFRAGMENT = "DoctorFragment_Replace"
    var HOSPITALFRAGMENT = "HospitalFragment"
    var TODAYSPECIALFRAGMENT = "TodaySpecialFragment"
    var ASSOCIATIONFRAGMENT = "AssociationFragment"
    var BUYANDSELLFRAGMENT = "BuyAndSellFragment"


    ////ABC
    var CONFIGURE = "isConfigure"
}