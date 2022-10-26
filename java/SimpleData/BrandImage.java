package tbclient.SimpleData;

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
public final class BrandImage extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_HEIGHT;
    public static final String DEFAULT_URL = "";
    public static final Integer DEFAULT_WIDTH;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer height;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String url;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer width;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer height;
        public String url;
        public Integer width;

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
        public Builder(BrandImage brandImage) {
            super(brandImage);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {brandImage};
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
            if (brandImage == null) {
                return;
            }
            this.url = brandImage.url;
            this.width = brandImage.width;
            this.height = brandImage.height;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BrandImage build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new BrandImage(this, z, null);
            }
            return (BrandImage) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-95257378, "Ltbclient/SimpleData/BrandImage;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-95257378, "Ltbclient/SimpleData/BrandImage;");
                return;
            }
        }
        DEFAULT_WIDTH = 0;
        DEFAULT_HEIGHT = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandImage(Builder builder, boolean z) {
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
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
            Integer num = builder.width;
            if (num == null) {
                this.width = DEFAULT_WIDTH;
            } else {
                this.width = num;
            }
            Integer num2 = builder.height;
            if (num2 == null) {
                this.height = DEFAULT_HEIGHT;
                return;
            } else {
                this.height = num2;
                return;
            }
        }
        this.url = builder.url;
        this.width = builder.width;
        this.height = builder.height;
    }

    public /* synthetic */ BrandImage(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
