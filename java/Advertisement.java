package tbclient;

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
/* loaded from: classes4.dex */
public final class Advertisement extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ADVERTISEMENT_ID = "";
    public static final String DEFAULT_CLICK_STATISTICS_URL = "";
    public static final String DEFAULT_DEEPLINK = "";
    public static final String DEFAULT_FLOATING_TEXT = "";
    public static final String DEFAULT_JUMP_LINK = "";
    public static final String DEFAULT_PACKAGE_NAME = "";
    public static final String DEFAULT_PIC = "";
    public static final String DEFAULT_PIC_CLICK = "";
    public static final String DEFAULT_SCHEME = "";
    public static final Long DEFAULT_TIME;
    public static final String DEFAULT_VIEW_STATISTICS_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String advertisement_id;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String click_statistics_url;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String deeplink;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String floating_text;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String jump_link;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String package_name;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String pic;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pic_click;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String scheme;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long time;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String view_statistics_url;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<Advertisement> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String advertisement_id;
        public String click_statistics_url;
        public String deeplink;
        public String floating_text;
        public String jump_link;
        public String package_name;
        public String pic;
        public String pic_click;
        public String scheme;
        public Long time;
        public String view_statistics_url;

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
        public Builder(Advertisement advertisement) {
            super(advertisement);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {advertisement};
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
            if (advertisement == null) {
                return;
            }
            this.time = advertisement.time;
            this.pic = advertisement.pic;
            this.pic_click = advertisement.pic_click;
            this.jump_link = advertisement.jump_link;
            this.advertisement_id = advertisement.advertisement_id;
            this.view_statistics_url = advertisement.view_statistics_url;
            this.click_statistics_url = advertisement.click_statistics_url;
            this.floating_text = advertisement.floating_text;
            this.deeplink = advertisement.deeplink;
            this.scheme = advertisement.scheme;
            this.package_name = advertisement.package_name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Advertisement build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new Advertisement(this, z, null) : (Advertisement) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1543461312, "Ltbclient/Advertisement;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1543461312, "Ltbclient/Advertisement;");
                return;
            }
        }
        DEFAULT_TIME = 0L;
    }

    public /* synthetic */ Advertisement(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Advertisement(Builder builder, boolean z) {
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
            Long l = builder.time;
            if (l == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = l;
            }
            String str = builder.pic;
            if (str == null) {
                this.pic = "";
            } else {
                this.pic = str;
            }
            String str2 = builder.pic_click;
            if (str2 == null) {
                this.pic_click = "";
            } else {
                this.pic_click = str2;
            }
            String str3 = builder.jump_link;
            if (str3 == null) {
                this.jump_link = "";
            } else {
                this.jump_link = str3;
            }
            String str4 = builder.advertisement_id;
            if (str4 == null) {
                this.advertisement_id = "";
            } else {
                this.advertisement_id = str4;
            }
            String str5 = builder.view_statistics_url;
            if (str5 == null) {
                this.view_statistics_url = "";
            } else {
                this.view_statistics_url = str5;
            }
            String str6 = builder.click_statistics_url;
            if (str6 == null) {
                this.click_statistics_url = "";
            } else {
                this.click_statistics_url = str6;
            }
            String str7 = builder.floating_text;
            if (str7 == null) {
                this.floating_text = "";
            } else {
                this.floating_text = str7;
            }
            String str8 = builder.deeplink;
            if (str8 == null) {
                this.deeplink = "";
            } else {
                this.deeplink = str8;
            }
            String str9 = builder.scheme;
            if (str9 == null) {
                this.scheme = "";
            } else {
                this.scheme = str9;
            }
            String str10 = builder.package_name;
            if (str10 == null) {
                this.package_name = "";
                return;
            } else {
                this.package_name = str10;
                return;
            }
        }
        this.time = builder.time;
        this.pic = builder.pic;
        this.pic_click = builder.pic_click;
        this.jump_link = builder.jump_link;
        this.advertisement_id = builder.advertisement_id;
        this.view_statistics_url = builder.view_statistics_url;
        this.click_statistics_url = builder.click_statistics_url;
        this.floating_text = builder.floating_text;
        this.deeplink = builder.deeplink;
        this.scheme = builder.scheme;
        this.package_name = builder.package_name;
    }
}
