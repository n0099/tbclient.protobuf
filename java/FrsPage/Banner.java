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
/* loaded from: classes5.dex */
public final class Banner extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_BANNER_TYPE;
    public static final String DEFAULT_BANNER_URL = "";
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_OBJ_ID = "";
    public static final String DEFAULT_TAG_NAME = "";
    public static final String DEFAULT_TAG_NAME_URL = "";
    public static final String DEFAULT_TAG_NAME_WH = "";
    public static final Integer DEFAULT_TEMPLATE_ID;
    public static final Integer DEFAULT_TYPE;
    public static final String DEFAULT_VALUE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer banner_type;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String banner_url;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String obj_id;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String tag_name;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String tag_name_url;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String tag_name_wh;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer template_id;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String value;

    /* loaded from: classes5.dex */
    public static final class Builder extends Message.Builder<Banner> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer banner_type;
        public String banner_url;
        public String desc;
        public String obj_id;
        public String tag_name;
        public String tag_name_url;
        public String tag_name_wh;
        public Integer template_id;
        public Integer type;
        public String value;

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
        public Builder(Banner banner) {
            super(banner);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {banner};
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
            if (banner == null) {
                return;
            }
            this.banner_url = banner.banner_url;
            this.banner_type = banner.banner_type;
            this.value = banner.value;
            this.type = banner.type;
            this.desc = banner.desc;
            this.template_id = banner.template_id;
            this.obj_id = banner.obj_id;
            this.tag_name = banner.tag_name;
            this.tag_name_url = banner.tag_name_url;
            this.tag_name_wh = banner.tag_name_wh;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Banner build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new Banner(this, z, null) : (Banner) invokeZ.objValue;
        }
    }

    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(119583628, "Ltbclient/FrsPage/Banner;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(119583628, "Ltbclient/FrsPage/Banner;");
                return;
            }
        }
        DEFAULT_BANNER_TYPE = 0;
        DEFAULT_TYPE = 0;
        DEFAULT_TEMPLATE_ID = 0;
    }

    public /* synthetic */ Banner(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Banner(Builder builder, boolean z) {
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
            String str = builder.banner_url;
            if (str == null) {
                this.banner_url = "";
            } else {
                this.banner_url = str;
            }
            Integer num = builder.banner_type;
            if (num == null) {
                this.banner_type = DEFAULT_BANNER_TYPE;
            } else {
                this.banner_type = num;
            }
            String str2 = builder.value;
            if (str2 == null) {
                this.value = "";
            } else {
                this.value = str2;
            }
            Integer num2 = builder.type;
            if (num2 == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num2;
            }
            String str3 = builder.desc;
            if (str3 == null) {
                this.desc = "";
            } else {
                this.desc = str3;
            }
            Integer num3 = builder.template_id;
            if (num3 == null) {
                this.template_id = DEFAULT_TEMPLATE_ID;
            } else {
                this.template_id = num3;
            }
            String str4 = builder.obj_id;
            if (str4 == null) {
                this.obj_id = "";
            } else {
                this.obj_id = str4;
            }
            String str5 = builder.tag_name;
            if (str5 == null) {
                this.tag_name = "";
            } else {
                this.tag_name = str5;
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
                return;
            } else {
                this.tag_name_wh = str7;
                return;
            }
        }
        this.banner_url = builder.banner_url;
        this.banner_type = builder.banner_type;
        this.value = builder.value;
        this.type = builder.type;
        this.desc = builder.desc;
        this.template_id = builder.template_id;
        this.obj_id = builder.obj_id;
        this.tag_name = builder.tag_name;
        this.tag_name_url = builder.tag_name_url;
        this.tag_name_wh = builder.tag_name_wh;
    }
}
