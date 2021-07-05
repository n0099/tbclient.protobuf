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
/* loaded from: classes10.dex */
public final class HeadSdk extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_HEAD_PIC = "";
    public static final String DEFAULT_HEAD_TEXT = "";
    public static final Integer DEFAULT_HEAD_TYPE;
    public static final String DEFAULT_SDK_NAME = "";
    public static final String DEFAULT_SDK_PARAMS = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String head_pic;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String head_text;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer head_type;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String sdk_name;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String sdk_params;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<HeadSdk> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String head_pic;
        public String head_text;
        public Integer head_type;
        public String sdk_name;
        public String sdk_params;

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
        public Builder(HeadSdk headSdk) {
            super(headSdk);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {headSdk};
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
            if (headSdk == null) {
                return;
            }
            this.head_pic = headSdk.head_pic;
            this.head_text = headSdk.head_text;
            this.sdk_name = headSdk.sdk_name;
            this.sdk_params = headSdk.sdk_params;
            this.head_type = headSdk.head_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HeadSdk build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new HeadSdk(this, z, null) : (HeadSdk) invokeZ.objValue;
        }
    }

    /* loaded from: classes10.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(152137700, "Ltbclient/FrsPage/HeadSdk;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(152137700, "Ltbclient/FrsPage/HeadSdk;");
                return;
            }
        }
        DEFAULT_HEAD_TYPE = 0;
    }

    public /* synthetic */ HeadSdk(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeadSdk(Builder builder, boolean z) {
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
            String str = builder.head_pic;
            if (str == null) {
                this.head_pic = "";
            } else {
                this.head_pic = str;
            }
            String str2 = builder.head_text;
            if (str2 == null) {
                this.head_text = "";
            } else {
                this.head_text = str2;
            }
            String str3 = builder.sdk_name;
            if (str3 == null) {
                this.sdk_name = "";
            } else {
                this.sdk_name = str3;
            }
            String str4 = builder.sdk_params;
            if (str4 == null) {
                this.sdk_params = "";
            } else {
                this.sdk_params = str4;
            }
            Integer num = builder.head_type;
            if (num == null) {
                this.head_type = DEFAULT_HEAD_TYPE;
                return;
            } else {
                this.head_type = num;
                return;
            }
        }
        this.head_pic = builder.head_pic;
        this.head_text = builder.head_text;
        this.sdk_name = builder.sdk_name;
        this.sdk_params = builder.sdk_params;
        this.head_type = builder.head_type;
    }
}
