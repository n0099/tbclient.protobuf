package tbclient.FrsPage;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes4.dex */
public final class HeadImgs extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_BTN_TEXT = "";
    public static final String DEFAULT_DOWNLOAD_APPID = "";
    public static final String DEFAULT_DOWNLOAD_APPNAME = "";
    public static final String DEFAULT_DOWNLOAD_DEVELOPER = "";
    public static final String DEFAULT_DOWNLOAD_IMG = "";
    public static final Integer DEFAULT_DOWNLOAD_IS_THIRDPAGE;
    public static final Integer DEFAULT_DOWNLOAD_ITEM_ID;
    public static final String DEFAULT_DOWNLOAD_PACKAGE_NAME = "";
    public static final String DEFAULT_DOWNLOAD_PACKAGE_SIZE = "";
    public static final String DEFAULT_DOWNLOAD_PRIVACY_POLICY = "";
    public static final String DEFAULT_DOWNLOAD_URL = "";
    public static final String DEFAULT_DOWNLOAD_USER_POWER = "";
    public static final String DEFAULT_DOWNLOAD_VERSION = "";
    public static final Integer DEFAULT_HAS_SECOND_PAGE;
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_PACKAGE_NAME = "";
    public static final String DEFAULT_PC_URL = "";
    public static final String DEFAULT_SCHEMA = "";
    public static final String DEFAULT_SUBTITLE = "";
    public static final String DEFAULT_TAG_NAME_URL = "";
    public static final String DEFAULT_TAG_NAME_WH = "";
    public static final List<String> DEFAULT_THIRD_STATISTICS_URL;
    public static final String DEFAULT_TITLE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String btn_text;
    @ProtoField(tag = 23, type = Message.Datatype.STRING)
    public final String download_appid;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String download_appname;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String download_developer;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String download_img;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer download_is_thirdpage;
    @ProtoField(tag = 22, type = Message.Datatype.INT32)
    public final Integer download_item_id;
    @ProtoField(tag = 21, type = Message.Datatype.STRING)
    public final String download_package_name;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String download_package_size;
    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String download_privacy_policy;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String download_url;
    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public final String download_user_power;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String download_version;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer has_second_page;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String package_name;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String pc_url;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String schema;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String subtitle;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String tag_name_url;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String tag_name_wh;
    @ProtoField(label = Message.Label.REPEATED, tag = 9, type = Message.Datatype.STRING)
    public final List<String> third_statistics_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<HeadImgs> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String btn_text;
        public String download_appid;
        public String download_appname;
        public String download_developer;
        public String download_img;
        public Integer download_is_thirdpage;
        public Integer download_item_id;
        public String download_package_name;
        public String download_package_size;
        public String download_privacy_policy;
        public String download_url;
        public String download_user_power;
        public String download_version;
        public Integer has_second_page;
        public String img_url;
        public String package_name;
        public String pc_url;
        public String schema;
        public String subtitle;
        public String tag_name_url;
        public String tag_name_wh;
        public List<String> third_statistics_url;
        public String title;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(HeadImgs headImgs) {
            super(headImgs);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {headImgs};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (headImgs == null) {
                return;
            }
            this.img_url = headImgs.img_url;
            this.pc_url = headImgs.pc_url;
            this.title = headImgs.title;
            this.subtitle = headImgs.subtitle;
            this.btn_text = headImgs.btn_text;
            this.tag_name_url = headImgs.tag_name_url;
            this.tag_name_wh = headImgs.tag_name_wh;
            this.schema = headImgs.schema;
            this.third_statistics_url = Message.copyOf(headImgs.third_statistics_url);
            this.has_second_page = headImgs.has_second_page;
            this.package_name = headImgs.package_name;
            this.download_is_thirdpage = headImgs.download_is_thirdpage;
            this.download_appname = headImgs.download_appname;
            this.download_developer = headImgs.download_developer;
            this.download_package_size = headImgs.download_package_size;
            this.download_url = headImgs.download_url;
            this.download_img = headImgs.download_img;
            this.download_version = headImgs.download_version;
            this.download_user_power = headImgs.download_user_power;
            this.download_privacy_policy = headImgs.download_privacy_policy;
            this.download_package_name = headImgs.download_package_name;
            this.download_item_id = headImgs.download_item_id;
            this.download_appid = headImgs.download_appid;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HeadImgs build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new HeadImgs(this, z, null) : (HeadImgs) invokeZ.objValue;
        }
    }

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(412332264, "Ltbclient/FrsPage/HeadImgs;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(412332264, "Ltbclient/FrsPage/HeadImgs;");
                return;
            }
        }
        DEFAULT_THIRD_STATISTICS_URL = Collections.emptyList();
        DEFAULT_HAS_SECOND_PAGE = 0;
        DEFAULT_DOWNLOAD_IS_THIRDPAGE = 0;
        DEFAULT_DOWNLOAD_ITEM_ID = 0;
    }

    public /* synthetic */ HeadImgs(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeadImgs(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.img_url;
            if (str == null) {
                this.img_url = "";
            } else {
                this.img_url = str;
            }
            String str2 = builder.pc_url;
            if (str2 == null) {
                this.pc_url = "";
            } else {
                this.pc_url = str2;
            }
            String str3 = builder.title;
            if (str3 == null) {
                this.title = "";
            } else {
                this.title = str3;
            }
            String str4 = builder.subtitle;
            if (str4 == null) {
                this.subtitle = "";
            } else {
                this.subtitle = str4;
            }
            String str5 = builder.btn_text;
            if (str5 == null) {
                this.btn_text = "";
            } else {
                this.btn_text = str5;
            }
            String str6 = builder.tag_name_url;
            if (str6 == null) {
                this.tag_name_url = "";
            } else {
                this.tag_name_url = str6;
            }
            String str7 = builder.tag_name_wh;
            if (str7 == null) {
                this.tag_name_wh = "";
            } else {
                this.tag_name_wh = str7;
            }
            String str8 = builder.schema;
            if (str8 == null) {
                this.schema = "";
            } else {
                this.schema = str8;
            }
            List<String> list = builder.third_statistics_url;
            if (list == null) {
                this.third_statistics_url = DEFAULT_THIRD_STATISTICS_URL;
            } else {
                this.third_statistics_url = Message.immutableCopyOf(list);
            }
            Integer num = builder.has_second_page;
            if (num == null) {
                this.has_second_page = DEFAULT_HAS_SECOND_PAGE;
            } else {
                this.has_second_page = num;
            }
            String str9 = builder.package_name;
            if (str9 == null) {
                this.package_name = "";
            } else {
                this.package_name = str9;
            }
            Integer num2 = builder.download_is_thirdpage;
            if (num2 == null) {
                this.download_is_thirdpage = DEFAULT_DOWNLOAD_IS_THIRDPAGE;
            } else {
                this.download_is_thirdpage = num2;
            }
            String str10 = builder.download_appname;
            if (str10 == null) {
                this.download_appname = "";
            } else {
                this.download_appname = str10;
            }
            String str11 = builder.download_developer;
            if (str11 == null) {
                this.download_developer = "";
            } else {
                this.download_developer = str11;
            }
            String str12 = builder.download_package_size;
            if (str12 == null) {
                this.download_package_size = "";
            } else {
                this.download_package_size = str12;
            }
            String str13 = builder.download_url;
            if (str13 == null) {
                this.download_url = "";
            } else {
                this.download_url = str13;
            }
            String str14 = builder.download_img;
            if (str14 == null) {
                this.download_img = "";
            } else {
                this.download_img = str14;
            }
            String str15 = builder.download_version;
            if (str15 == null) {
                this.download_version = "";
            } else {
                this.download_version = str15;
            }
            String str16 = builder.download_user_power;
            if (str16 == null) {
                this.download_user_power = "";
            } else {
                this.download_user_power = str16;
            }
            String str17 = builder.download_privacy_policy;
            if (str17 == null) {
                this.download_privacy_policy = "";
            } else {
                this.download_privacy_policy = str17;
            }
            String str18 = builder.download_package_name;
            if (str18 == null) {
                this.download_package_name = "";
            } else {
                this.download_package_name = str18;
            }
            Integer num3 = builder.download_item_id;
            if (num3 == null) {
                this.download_item_id = DEFAULT_DOWNLOAD_ITEM_ID;
            } else {
                this.download_item_id = num3;
            }
            String str19 = builder.download_appid;
            if (str19 == null) {
                this.download_appid = "";
                return;
            } else {
                this.download_appid = str19;
                return;
            }
        }
        this.img_url = builder.img_url;
        this.pc_url = builder.pc_url;
        this.title = builder.title;
        this.subtitle = builder.subtitle;
        this.btn_text = builder.btn_text;
        this.tag_name_url = builder.tag_name_url;
        this.tag_name_wh = builder.tag_name_wh;
        this.schema = builder.schema;
        this.third_statistics_url = Message.immutableCopyOf(builder.third_statistics_url);
        this.has_second_page = builder.has_second_page;
        this.package_name = builder.package_name;
        this.download_is_thirdpage = builder.download_is_thirdpage;
        this.download_appname = builder.download_appname;
        this.download_developer = builder.download_developer;
        this.download_package_size = builder.download_package_size;
        this.download_url = builder.download_url;
        this.download_img = builder.download_img;
        this.download_version = builder.download_version;
        this.download_user_power = builder.download_user_power;
        this.download_privacy_policy = builder.download_privacy_policy;
        this.download_package_name = builder.download_package_name;
        this.download_item_id = builder.download_item_id;
        this.download_appid = builder.download_appid;
    }
}
