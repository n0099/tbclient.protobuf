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
/* loaded from: classes9.dex */
public final class CartoonBookInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_CARTOON_ID;
    public static final String DEFAULT_CARTOON_NAME = "";
    public static final Integer DEFAULT_CARTOON_VIP;
    public static final String DEFAULT_COVER_IMG = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long cartoon_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String cartoon_name;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer cartoon_vip;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String cover_img;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<CartoonBookInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long cartoon_id;
        public String cartoon_name;
        public Integer cartoon_vip;
        public String cover_img;

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
        public Builder(CartoonBookInfo cartoonBookInfo) {
            super(cartoonBookInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {cartoonBookInfo};
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
            if (cartoonBookInfo == null) {
                return;
            }
            this.cartoon_id = cartoonBookInfo.cartoon_id;
            this.cartoon_name = cartoonBookInfo.cartoon_name;
            this.cover_img = cartoonBookInfo.cover_img;
            this.cartoon_vip = cartoonBookInfo.cartoon_vip;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CartoonBookInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new CartoonBookInfo(this, z, null) : (CartoonBookInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1278529280, "Ltbclient/CartoonBookInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1278529280, "Ltbclient/CartoonBookInfo;");
                return;
            }
        }
        DEFAULT_CARTOON_ID = 0L;
        DEFAULT_CARTOON_VIP = 0;
    }

    public /* synthetic */ CartoonBookInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartoonBookInfo(Builder builder, boolean z) {
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
            Long l = builder.cartoon_id;
            if (l == null) {
                this.cartoon_id = DEFAULT_CARTOON_ID;
            } else {
                this.cartoon_id = l;
            }
            String str = builder.cartoon_name;
            if (str == null) {
                this.cartoon_name = "";
            } else {
                this.cartoon_name = str;
            }
            String str2 = builder.cover_img;
            if (str2 == null) {
                this.cover_img = "";
            } else {
                this.cover_img = str2;
            }
            Integer num = builder.cartoon_vip;
            if (num == null) {
                this.cartoon_vip = DEFAULT_CARTOON_VIP;
                return;
            } else {
                this.cartoon_vip = num;
                return;
            }
        }
        this.cartoon_id = builder.cartoon_id;
        this.cartoon_name = builder.cartoon_name;
        this.cover_img = builder.cover_img;
        this.cartoon_vip = builder.cartoon_vip;
    }
}
