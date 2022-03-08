package tbclient.GetIconList;

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
/* loaded from: classes9.dex */
public final class Custom extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_CREATE_TIME = "";
    public static final List<Discount> DEFAULT_DISCOUNT;
    public static final Integer DEFAULT_DUBI;
    public static final Integer DEFAULT_DUBI_IOS;
    public static final Integer DEFAULT_DURATION;
    public static final Integer DEFAULT_HIDE;
    public static final String DEFAULT_ICON_ID = "";
    public static final String DEFAULT_ICON_NAME = "";
    public static final String DEFAULT_ICON_PIC = "";
    public static final Integer DEFAULT_IOS_DISPLAY;
    public static final String DEFAULT_IOS_ICON_ID = "";
    public static final Integer DEFAULT_IS_CUSTOM_PRICE;
    public static final Integer DEFAULT_IS_DEFAULT;
    public static final String DEFAULT_NAME = "";
    public static final Integer DEFAULT_NON_MEMBER_I;
    public static final Integer DEFAULT_NON_MEMBER_T;
    public static final String DEFAULT_PACKAGE_PIC = "";
    public static final String DEFAULT_PIC_URL = "";
    public static final String DEFAULT_PRODUCT_ID = "";
    public static final Integer DEFAULT_PROPS_ID;
    public static final String DEFAULT_TAG_NAME = "";
    public static final String DEFAULT_UPDATE_TIME = "";
    public static final Integer DEFAULT_VALIDITY;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String create_time;
    @ProtoField(label = Message.Label.REPEATED, tag = 9)
    public final List<Discount> discount;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer dubi;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer dubi_ios;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer duration;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer hide;
    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public final String icon_id;
    @ProtoField(tag = 21, type = Message.Datatype.STRING)
    public final String icon_name;
    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String icon_pic;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer ios_display;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String ios_icon_id;
    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public final Integer is_custom_price;
    @ProtoField(tag = 23, type = Message.Datatype.INT32)
    public final Integer is_default;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer non_member_i;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer non_member_t;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String package_pic;
    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String product_id;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer props_id;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String tag_name;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String update_time;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer validity;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Custom> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String create_time;
        public List<Discount> discount;
        public Integer dubi;
        public Integer dubi_ios;
        public Integer duration;
        public Integer hide;
        public String icon_id;
        public String icon_name;
        public String icon_pic;
        public Integer ios_display;
        public String ios_icon_id;
        public Integer is_custom_price;
        public Integer is_default;
        public String name;
        public Integer non_member_i;
        public Integer non_member_t;
        public String package_pic;
        public String pic_url;
        public String product_id;
        public Integer props_id;
        public String tag_name;
        public String update_time;
        public Integer validity;

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
        public Builder(Custom custom) {
            super(custom);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {custom};
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
            if (custom == null) {
                return;
            }
            this.name = custom.name;
            this.non_member_t = custom.non_member_t;
            this.non_member_i = custom.non_member_i;
            this.dubi = custom.dubi;
            this.dubi_ios = custom.dubi_ios;
            this.ios_display = custom.ios_display;
            this.duration = custom.duration;
            this.hide = custom.hide;
            this.discount = Message.copyOf(custom.discount);
            this.props_id = custom.props_id;
            this.ios_icon_id = custom.ios_icon_id;
            this.validity = custom.validity;
            this.update_time = custom.update_time;
            this.create_time = custom.create_time;
            this.package_pic = custom.package_pic;
            this.is_custom_price = custom.is_custom_price;
            this.tag_name = custom.tag_name;
            this.product_id = custom.product_id;
            this.icon_id = custom.icon_id;
            this.pic_url = custom.pic_url;
            this.icon_name = custom.icon_name;
            this.icon_pic = custom.icon_pic;
            this.is_default = custom.is_default;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Custom build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new Custom(this, z, null) : (Custom) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(479907774, "Ltbclient/GetIconList/Custom;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(479907774, "Ltbclient/GetIconList/Custom;");
                return;
            }
        }
        DEFAULT_NON_MEMBER_T = 0;
        DEFAULT_NON_MEMBER_I = 0;
        DEFAULT_DUBI = 0;
        DEFAULT_DUBI_IOS = 0;
        DEFAULT_IOS_DISPLAY = 0;
        DEFAULT_DURATION = 0;
        DEFAULT_HIDE = 0;
        DEFAULT_DISCOUNT = Collections.emptyList();
        DEFAULT_PROPS_ID = 0;
        DEFAULT_VALIDITY = 0;
        DEFAULT_IS_CUSTOM_PRICE = 0;
        DEFAULT_IS_DEFAULT = 0;
    }

    public /* synthetic */ Custom(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Custom(Builder builder, boolean z) {
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
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            Integer num = builder.non_member_t;
            if (num == null) {
                this.non_member_t = DEFAULT_NON_MEMBER_T;
            } else {
                this.non_member_t = num;
            }
            Integer num2 = builder.non_member_i;
            if (num2 == null) {
                this.non_member_i = DEFAULT_NON_MEMBER_I;
            } else {
                this.non_member_i = num2;
            }
            Integer num3 = builder.dubi;
            if (num3 == null) {
                this.dubi = DEFAULT_DUBI;
            } else {
                this.dubi = num3;
            }
            Integer num4 = builder.dubi_ios;
            if (num4 == null) {
                this.dubi_ios = DEFAULT_DUBI_IOS;
            } else {
                this.dubi_ios = num4;
            }
            Integer num5 = builder.ios_display;
            if (num5 == null) {
                this.ios_display = DEFAULT_IOS_DISPLAY;
            } else {
                this.ios_display = num5;
            }
            Integer num6 = builder.duration;
            if (num6 == null) {
                this.duration = DEFAULT_DURATION;
            } else {
                this.duration = num6;
            }
            Integer num7 = builder.hide;
            if (num7 == null) {
                this.hide = DEFAULT_HIDE;
            } else {
                this.hide = num7;
            }
            List<Discount> list = builder.discount;
            if (list == null) {
                this.discount = DEFAULT_DISCOUNT;
            } else {
                this.discount = Message.immutableCopyOf(list);
            }
            Integer num8 = builder.props_id;
            if (num8 == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = num8;
            }
            String str2 = builder.ios_icon_id;
            if (str2 == null) {
                this.ios_icon_id = "";
            } else {
                this.ios_icon_id = str2;
            }
            Integer num9 = builder.validity;
            if (num9 == null) {
                this.validity = DEFAULT_VALIDITY;
            } else {
                this.validity = num9;
            }
            String str3 = builder.update_time;
            if (str3 == null) {
                this.update_time = "";
            } else {
                this.update_time = str3;
            }
            String str4 = builder.create_time;
            if (str4 == null) {
                this.create_time = "";
            } else {
                this.create_time = str4;
            }
            String str5 = builder.package_pic;
            if (str5 == null) {
                this.package_pic = "";
            } else {
                this.package_pic = str5;
            }
            Integer num10 = builder.is_custom_price;
            if (num10 == null) {
                this.is_custom_price = DEFAULT_IS_CUSTOM_PRICE;
            } else {
                this.is_custom_price = num10;
            }
            String str6 = builder.tag_name;
            if (str6 == null) {
                this.tag_name = "";
            } else {
                this.tag_name = str6;
            }
            String str7 = builder.product_id;
            if (str7 == null) {
                this.product_id = "";
            } else {
                this.product_id = str7;
            }
            String str8 = builder.icon_id;
            if (str8 == null) {
                this.icon_id = "";
            } else {
                this.icon_id = str8;
            }
            String str9 = builder.pic_url;
            if (str9 == null) {
                this.pic_url = "";
            } else {
                this.pic_url = str9;
            }
            String str10 = builder.icon_name;
            if (str10 == null) {
                this.icon_name = "";
            } else {
                this.icon_name = str10;
            }
            String str11 = builder.icon_pic;
            if (str11 == null) {
                this.icon_pic = "";
            } else {
                this.icon_pic = str11;
            }
            Integer num11 = builder.is_default;
            if (num11 == null) {
                this.is_default = DEFAULT_IS_DEFAULT;
                return;
            } else {
                this.is_default = num11;
                return;
            }
        }
        this.name = builder.name;
        this.non_member_t = builder.non_member_t;
        this.non_member_i = builder.non_member_i;
        this.dubi = builder.dubi;
        this.dubi_ios = builder.dubi_ios;
        this.ios_display = builder.ios_display;
        this.duration = builder.duration;
        this.hide = builder.hide;
        this.discount = Message.immutableCopyOf(builder.discount);
        this.props_id = builder.props_id;
        this.ios_icon_id = builder.ios_icon_id;
        this.validity = builder.validity;
        this.update_time = builder.update_time;
        this.create_time = builder.create_time;
        this.package_pic = builder.package_pic;
        this.is_custom_price = builder.is_custom_price;
        this.tag_name = builder.tag_name;
        this.product_id = builder.product_id;
        this.icon_id = builder.icon_id;
        this.pic_url = builder.pic_url;
        this.icon_name = builder.icon_name;
        this.icon_pic = builder.icon_pic;
        this.is_default = builder.is_default;
    }
}
