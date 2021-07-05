package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class NativeApp extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_DOWNLOAD_AND = "";
    public static final String DEFAULT_DOWNLOAD_IOS = "";
    public static final String DEFAULT_JUMP_AND = "";
    public static final String DEFAULT_JUMP_IOS = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String download_and;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String download_ios;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String jump_and;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String jump_ios;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<NativeApp> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String download_and;
        public String download_ios;
        public String jump_and;
        public String jump_ios;

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
        public Builder(NativeApp nativeApp) {
            super(nativeApp);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {nativeApp};
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
            if (nativeApp == null) {
                return;
            }
            this.jump_and = nativeApp.jump_and;
            this.jump_ios = nativeApp.jump_ios;
            this.download_and = nativeApp.download_and;
            this.download_ios = nativeApp.download_ios;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NativeApp build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new NativeApp(this, z, null) : (NativeApp) invokeZ.objValue;
        }
    }

    /* loaded from: classes10.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    public /* synthetic */ NativeApp(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeApp(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65536, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65536, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.jump_and;
            if (str == null) {
                this.jump_and = "";
            } else {
                this.jump_and = str;
            }
            String str2 = builder.jump_ios;
            if (str2 == null) {
                this.jump_ios = "";
            } else {
                this.jump_ios = str2;
            }
            String str3 = builder.download_and;
            if (str3 == null) {
                this.download_and = "";
            } else {
                this.download_and = str3;
            }
            String str4 = builder.download_ios;
            if (str4 == null) {
                this.download_ios = "";
                return;
            } else {
                this.download_ios = str4;
                return;
            }
        }
        this.jump_and = builder.jump_and;
        this.jump_ios = builder.jump_ios;
        this.download_and = builder.download_and;
        this.download_ios = builder.download_ios;
    }
}
