package tbclient.GetDynamicGiftList;

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
public final class GiftZip extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_IS_LANDSCAPE;
    public static final String DEFAULT_ZIP_MD5 = "";
    public static final String DEFAULT_ZIP_NAME = "";
    public static final String DEFAULT_ZIP_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_landscape;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String zip_md5;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String zip_name;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String zip_url;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GiftZip> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer is_landscape;
        public String zip_md5;
        public String zip_name;
        public String zip_url;

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
        public Builder(GiftZip giftZip) {
            super(giftZip);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {giftZip};
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
            if (giftZip == null) {
                return;
            }
            this.zip_md5 = giftZip.zip_md5;
            this.zip_url = giftZip.zip_url;
            this.zip_name = giftZip.zip_name;
            this.is_landscape = giftZip.is_landscape;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GiftZip build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new GiftZip(this, z, null);
            }
            return (GiftZip) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(242002296, "Ltbclient/GetDynamicGiftList/GiftZip;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(242002296, "Ltbclient/GetDynamicGiftList/GiftZip;");
                return;
            }
        }
        DEFAULT_IS_LANDSCAPE = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftZip(Builder builder, boolean z) {
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
            String str = builder.zip_md5;
            if (str == null) {
                this.zip_md5 = "";
            } else {
                this.zip_md5 = str;
            }
            String str2 = builder.zip_url;
            if (str2 == null) {
                this.zip_url = "";
            } else {
                this.zip_url = str2;
            }
            String str3 = builder.zip_name;
            if (str3 == null) {
                this.zip_name = "";
            } else {
                this.zip_name = str3;
            }
            Integer num = builder.is_landscape;
            if (num == null) {
                this.is_landscape = DEFAULT_IS_LANDSCAPE;
                return;
            } else {
                this.is_landscape = num;
                return;
            }
        }
        this.zip_md5 = builder.zip_md5;
        this.zip_url = builder.zip_url;
        this.zip_name = builder.zip_name;
        this.is_landscape = builder.is_landscape;
    }

    public /* synthetic */ GiftZip(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
