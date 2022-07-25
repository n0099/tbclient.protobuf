package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class VcodeExtra extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ENDPOINT = "";
    public static final String DEFAULT_SLIDEENDPOINT = "";
    public static final String DEFAULT_SLIDEIMG = "";
    public static final String DEFAULT_SUCCESSIMG = "";
    public static final String DEFAULT_TEXTIMG = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String endpoint;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String slideendpoint;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String slideimg;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String successimg;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String textimg;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<VcodeExtra> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String endpoint;
        public String slideendpoint;
        public String slideimg;
        public String successimg;
        public String textimg;

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
        public Builder(VcodeExtra vcodeExtra) {
            super(vcodeExtra);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {vcodeExtra};
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
            if (vcodeExtra == null) {
                return;
            }
            this.textimg = vcodeExtra.textimg;
            this.slideimg = vcodeExtra.slideimg;
            this.endpoint = vcodeExtra.endpoint;
            this.successimg = vcodeExtra.successimg;
            this.slideendpoint = vcodeExtra.slideendpoint;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VcodeExtra build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new VcodeExtra(this, z, null) : (VcodeExtra) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    public /* synthetic */ VcodeExtra(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VcodeExtra(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65536, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65536, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.textimg;
            if (str == null) {
                this.textimg = "";
            } else {
                this.textimg = str;
            }
            String str2 = builder.slideimg;
            if (str2 == null) {
                this.slideimg = "";
            } else {
                this.slideimg = str2;
            }
            String str3 = builder.endpoint;
            if (str3 == null) {
                this.endpoint = "";
            } else {
                this.endpoint = str3;
            }
            String str4 = builder.successimg;
            if (str4 == null) {
                this.successimg = "";
            } else {
                this.successimg = str4;
            }
            String str5 = builder.slideendpoint;
            if (str5 == null) {
                this.slideendpoint = "";
                return;
            } else {
                this.slideendpoint = str5;
                return;
            }
        }
        this.textimg = builder.textimg;
        this.slideimg = builder.slideimg;
        this.endpoint = builder.endpoint;
        this.successimg = builder.successimg;
        this.slideendpoint = builder.slideendpoint;
    }
}
