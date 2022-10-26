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
public final class DebugInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ABSTRCT = "";
    public static final String DEFAULT_ACTION = "";
    public static final String DEFAULT_ERROR_CODE = "";
    public static final String DEFAULT_ERROR_MESSAGE = "";
    public static final String DEFAULT_EXT1 = "";
    public static final String DEFAULT_EXT2 = "";
    public static final String DEFAULT_EXT3 = "";
    public static final String DEFAULT_EXT4 = "";
    public static final Long DEFAULT_ID;
    public static final String DEFAULT_MODULE = "";
    public static final String DEFAULT_TITLE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String abstrct;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String action;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String error_code;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String error_message;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String ext1;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String ext2;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String ext3;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String ext4;
    @ProtoField(tag = 9, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String module;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String abstrct;
        public String action;
        public String error_code;
        public String error_message;
        public String ext1;
        public String ext2;
        public String ext3;
        public String ext4;
        public Long id;
        public String module;
        public String title;

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
        public Builder(DebugInfo debugInfo) {
            super(debugInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {debugInfo};
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
            if (debugInfo == null) {
                return;
            }
            this.module = debugInfo.module;
            this.action = debugInfo.action;
            this.error_code = debugInfo.error_code;
            this.error_message = debugInfo.error_message;
            this.ext1 = debugInfo.ext1;
            this.ext2 = debugInfo.ext2;
            this.ext3 = debugInfo.ext3;
            this.ext4 = debugInfo.ext4;
            this.id = debugInfo.id;
            this.title = debugInfo.title;
            this.abstrct = debugInfo.abstrct;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DebugInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new DebugInfo(this, z, null);
            }
            return (DebugInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-561765596, "Ltbclient/DebugInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-561765596, "Ltbclient/DebugInfo;");
                return;
            }
        }
        DEFAULT_ID = 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugInfo(Builder builder, boolean z) {
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
            String str = builder.module;
            if (str == null) {
                this.module = "";
            } else {
                this.module = str;
            }
            String str2 = builder.action;
            if (str2 == null) {
                this.action = "";
            } else {
                this.action = str2;
            }
            String str3 = builder.error_code;
            if (str3 == null) {
                this.error_code = "";
            } else {
                this.error_code = str3;
            }
            String str4 = builder.error_message;
            if (str4 == null) {
                this.error_message = "";
            } else {
                this.error_message = str4;
            }
            String str5 = builder.ext1;
            if (str5 == null) {
                this.ext1 = "";
            } else {
                this.ext1 = str5;
            }
            String str6 = builder.ext2;
            if (str6 == null) {
                this.ext2 = "";
            } else {
                this.ext2 = str6;
            }
            String str7 = builder.ext3;
            if (str7 == null) {
                this.ext3 = "";
            } else {
                this.ext3 = str7;
            }
            String str8 = builder.ext4;
            if (str8 == null) {
                this.ext4 = "";
            } else {
                this.ext4 = str8;
            }
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            String str9 = builder.title;
            if (str9 == null) {
                this.title = "";
            } else {
                this.title = str9;
            }
            String str10 = builder.abstrct;
            if (str10 == null) {
                this.abstrct = "";
                return;
            } else {
                this.abstrct = str10;
                return;
            }
        }
        this.module = builder.module;
        this.action = builder.action;
        this.error_code = builder.error_code;
        this.error_message = builder.error_message;
        this.ext1 = builder.ext1;
        this.ext2 = builder.ext2;
        this.ext3 = builder.ext3;
        this.ext4 = builder.ext4;
        this.id = builder.id;
        this.title = builder.title;
        this.abstrct = builder.abstrct;
    }

    public /* synthetic */ DebugInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
