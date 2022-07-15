package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class VcodeInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_VCODE_MD5 = "";
    public static final String DEFAULT_VCODE_PIC_URL = "";
    public static final String DEFAULT_VCODE_TYPE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4)
    public final VcodeExtra vcode_extra;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String vcode_md5;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String vcode_pic_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String vcode_type;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<VcodeInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public VcodeExtra vcode_extra;
        public String vcode_md5;
        public String vcode_pic_url;
        public String vcode_type;

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
        public Builder(VcodeInfo vcodeInfo) {
            super(vcodeInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {vcodeInfo};
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
            if (vcodeInfo == null) {
                return;
            }
            this.vcode_md5 = vcodeInfo.vcode_md5;
            this.vcode_pic_url = vcodeInfo.vcode_pic_url;
            this.vcode_type = vcodeInfo.vcode_type;
            this.vcode_extra = vcodeInfo.vcode_extra;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VcodeInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new VcodeInfo(this, z, null) : (VcodeInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes8.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    public /* synthetic */ VcodeInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VcodeInfo(Builder builder, boolean z) {
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
            String str = builder.vcode_md5;
            if (str == null) {
                this.vcode_md5 = "";
            } else {
                this.vcode_md5 = str;
            }
            String str2 = builder.vcode_pic_url;
            if (str2 == null) {
                this.vcode_pic_url = "";
            } else {
                this.vcode_pic_url = str2;
            }
            String str3 = builder.vcode_type;
            if (str3 == null) {
                this.vcode_type = "";
            } else {
                this.vcode_type = str3;
            }
            this.vcode_extra = builder.vcode_extra;
            return;
        }
        this.vcode_md5 = builder.vcode_md5;
        this.vcode_pic_url = builder.vcode_pic_url;
        this.vcode_type = builder.vcode_type;
        this.vcode_extra = builder.vcode_extra;
    }
}
