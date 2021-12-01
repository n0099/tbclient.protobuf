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
import java.util.Collections;
import java.util.List;
/* loaded from: classes4.dex */
public final class SignatureData extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<SignatureContent> DEFAULT_CONTENT;
    public static final String DEFAULT_FONTCOLOR = "";
    public static final String DEFAULT_FONTKEYNAME = "";
    public static final Integer DEFAULT_SIGNATURE_ID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<SignatureContent> content;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String fontColor;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String fontKeyName;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer signature_id;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<SignatureData> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<SignatureContent> content;
        public String fontColor;
        public String fontKeyName;
        public Integer signature_id;

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
        public Builder(SignatureData signatureData) {
            super(signatureData);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {signatureData};
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
            if (signatureData == null) {
                return;
            }
            this.signature_id = signatureData.signature_id;
            this.fontKeyName = signatureData.fontKeyName;
            this.fontColor = signatureData.fontColor;
            this.content = Message.copyOf(signatureData.content);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SignatureData build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new SignatureData(this, z, null) : (SignatureData) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1699571555, "Ltbclient/SignatureData;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1699571555, "Ltbclient/SignatureData;");
                return;
            }
        }
        DEFAULT_SIGNATURE_ID = 0;
        DEFAULT_CONTENT = Collections.emptyList();
    }

    public /* synthetic */ SignatureData(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignatureData(Builder builder, boolean z) {
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
            Integer num = builder.signature_id;
            if (num == null) {
                this.signature_id = DEFAULT_SIGNATURE_ID;
            } else {
                this.signature_id = num;
            }
            String str = builder.fontKeyName;
            if (str == null) {
                this.fontKeyName = "";
            } else {
                this.fontKeyName = str;
            }
            String str2 = builder.fontColor;
            if (str2 == null) {
                this.fontColor = "";
            } else {
                this.fontColor = str2;
            }
            List<SignatureContent> list = builder.content;
            if (list == null) {
                this.content = DEFAULT_CONTENT;
                return;
            } else {
                this.content = Message.immutableCopyOf(list);
                return;
            }
        }
        this.signature_id = builder.signature_id;
        this.fontKeyName = builder.fontKeyName;
        this.fontColor = builder.fontColor;
        this.content = Message.immutableCopyOf(builder.content);
    }
}
