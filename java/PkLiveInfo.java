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
public final class PkLiveInfo extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_CONTINUE_NUMBER;
    public static final Integer DEFAULT_CONTINUE_STATUS;
    public static final Integer DEFAULT_SIDE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer continue_number;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer continue_status;
    @ProtoField(tag = 3)
    public final LiveInfo live_info;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer side;
    @ProtoField(tag = 1)
    public final LiveUserInfo user_info;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer continue_number;
        public Integer continue_status;
        public LiveInfo live_info;
        public Integer side;
        public LiveUserInfo user_info;

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
        public Builder(PkLiveInfo pkLiveInfo) {
            super(pkLiveInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {pkLiveInfo};
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
            if (pkLiveInfo == null) {
                return;
            }
            this.user_info = pkLiveInfo.user_info;
            this.live_info = pkLiveInfo.live_info;
            this.continue_status = pkLiveInfo.continue_status;
            this.continue_number = pkLiveInfo.continue_number;
            this.side = pkLiveInfo.side;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PkLiveInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new PkLiveInfo(this, z, null);
            }
            return (PkLiveInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1363210460, "Ltbclient/PkLiveInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1363210460, "Ltbclient/PkLiveInfo;");
                return;
            }
        }
        DEFAULT_CONTINUE_STATUS = 0;
        DEFAULT_CONTINUE_NUMBER = 0;
        DEFAULT_SIDE = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkLiveInfo(Builder builder, boolean z) {
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
            this.user_info = builder.user_info;
            this.live_info = builder.live_info;
            Integer num = builder.continue_status;
            if (num == null) {
                this.continue_status = DEFAULT_CONTINUE_STATUS;
            } else {
                this.continue_status = num;
            }
            Integer num2 = builder.continue_number;
            if (num2 == null) {
                this.continue_number = DEFAULT_CONTINUE_NUMBER;
            } else {
                this.continue_number = num2;
            }
            Integer num3 = builder.side;
            if (num3 == null) {
                this.side = DEFAULT_SIDE;
                return;
            } else {
                this.side = num3;
                return;
            }
        }
        this.user_info = builder.user_info;
        this.live_info = builder.live_info;
        this.continue_status = builder.continue_status;
        this.continue_number = builder.continue_number;
        this.side = builder.side;
    }

    public /* synthetic */ PkLiveInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
