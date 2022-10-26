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
public final class UserSessionInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_BDUSS = "";
    public static final String DEFAULT_EMAIL = "";
    public static final String DEFAULT_MOBILE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String bduss;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String email;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String mobile;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String bduss;
        public String email;
        public String mobile;

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
        public Builder(UserSessionInfo userSessionInfo) {
            super(userSessionInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {userSessionInfo};
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
            if (userSessionInfo == null) {
                return;
            }
            this.bduss = userSessionInfo.bduss;
            this.mobile = userSessionInfo.mobile;
            this.email = userSessionInfo.email;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserSessionInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new UserSessionInfo(this, z, null);
            }
            return (UserSessionInfo) invokeZ.objValue;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSessionInfo(Builder builder, boolean z) {
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
            String str = builder.bduss;
            if (str == null) {
                this.bduss = "";
            } else {
                this.bduss = str;
            }
            String str2 = builder.mobile;
            if (str2 == null) {
                this.mobile = "";
            } else {
                this.mobile = str2;
            }
            String str3 = builder.email;
            if (str3 == null) {
                this.email = "";
                return;
            } else {
                this.email = str3;
                return;
            }
        }
        this.bduss = builder.bduss;
        this.mobile = builder.mobile;
        this.email = builder.email;
    }

    public /* synthetic */ UserSessionInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
