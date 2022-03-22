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
/* loaded from: classes8.dex */
public final class IconInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<Discount> DEFAULT_DISCOUNT;
    public static final Integer DEFAULT_DUBI;
    public static final Integer DEFAULT_DURATION;
    public static final Integer DEFAULT_HIDE;
    public static final String DEFAULT_ICONID = "";
    public static final Integer DEFAULT_IS_DEFAULT;
    public static final String DEFAULT_NAME = "";
    public static final Integer DEFAULT_NON_MEMBER_T;
    public static final String DEFAULT_PICURL = "";
    public static final String DEFAULT_SIGN = "";
    public static final String DEFAULT_TAG_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<Discount> discount;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer dubi;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer duration;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer hide;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String iconId;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer is_default;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer non_member_t;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String picUrl;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String sign;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String tag_name;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<IconInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<Discount> discount;
        public Integer dubi;
        public Integer duration;
        public Integer hide;
        public String iconId;
        public Integer is_default;
        public String name;
        public Integer non_member_t;
        public String picUrl;
        public String sign;
        public String tag_name;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(IconInfo iconInfo) {
            super(iconInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {iconInfo};
                interceptable.invokeUnInit(65537, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (iconInfo == null) {
                return;
            }
            this.name = iconInfo.name;
            this.iconId = iconInfo.iconId;
            this.picUrl = iconInfo.picUrl;
            this.non_member_t = iconInfo.non_member_t;
            this.dubi = iconInfo.dubi;
            this.duration = iconInfo.duration;
            this.hide = iconInfo.hide;
            this.discount = Message.copyOf(iconInfo.discount);
            this.sign = iconInfo.sign;
            this.tag_name = iconInfo.tag_name;
            this.is_default = iconInfo.is_default;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public IconInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new IconInfo(this, z, null) : (IconInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes8.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1392578520, "Ltbclient/GetIconList/IconInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1392578520, "Ltbclient/GetIconList/IconInfo;");
                return;
            }
        }
        DEFAULT_NON_MEMBER_T = 0;
        DEFAULT_DUBI = 0;
        DEFAULT_DURATION = 0;
        DEFAULT_HIDE = 0;
        DEFAULT_DISCOUNT = Collections.emptyList();
        DEFAULT_IS_DEFAULT = 0;
    }

    public /* synthetic */ IconInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconInfo(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
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
            String str2 = builder.iconId;
            if (str2 == null) {
                this.iconId = "";
            } else {
                this.iconId = str2;
            }
            String str3 = builder.picUrl;
            if (str3 == null) {
                this.picUrl = "";
            } else {
                this.picUrl = str3;
            }
            Integer num = builder.non_member_t;
            if (num == null) {
                this.non_member_t = DEFAULT_NON_MEMBER_T;
            } else {
                this.non_member_t = num;
            }
            Integer num2 = builder.dubi;
            if (num2 == null) {
                this.dubi = DEFAULT_DUBI;
            } else {
                this.dubi = num2;
            }
            Integer num3 = builder.duration;
            if (num3 == null) {
                this.duration = DEFAULT_DURATION;
            } else {
                this.duration = num3;
            }
            Integer num4 = builder.hide;
            if (num4 == null) {
                this.hide = DEFAULT_HIDE;
            } else {
                this.hide = num4;
            }
            List<Discount> list = builder.discount;
            if (list == null) {
                this.discount = DEFAULT_DISCOUNT;
            } else {
                this.discount = Message.immutableCopyOf(list);
            }
            String str4 = builder.sign;
            if (str4 == null) {
                this.sign = "";
            } else {
                this.sign = str4;
            }
            String str5 = builder.tag_name;
            if (str5 == null) {
                this.tag_name = "";
            } else {
                this.tag_name = str5;
            }
            Integer num5 = builder.is_default;
            if (num5 == null) {
                this.is_default = DEFAULT_IS_DEFAULT;
                return;
            } else {
                this.is_default = num5;
                return;
            }
        }
        this.name = builder.name;
        this.iconId = builder.iconId;
        this.picUrl = builder.picUrl;
        this.non_member_t = builder.non_member_t;
        this.dubi = builder.dubi;
        this.duration = builder.duration;
        this.hide = builder.hide;
        this.discount = Message.immutableCopyOf(builder.discount);
        this.sign = builder.sign;
        this.tag_name = builder.tag_name;
        this.is_default = builder.is_default;
    }
}
