package tbclient.Profile;

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
public final class GodDetailInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_DETAIL_INTRO = "";
    public static final Long DEFAULT_GOD_ID;
    public static final String DEFAULT_INTRO = "";
    public static final Long DEFAULT_USER_ID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String detail_intro;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long god_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String intro;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long user_id;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GodDetailInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String detail_intro;
        public Long god_id;
        public String intro;
        public Long user_id;

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
        public Builder(GodDetailInfo godDetailInfo) {
            super(godDetailInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {godDetailInfo};
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
            if (godDetailInfo == null) {
                return;
            }
            this.god_id = godDetailInfo.god_id;
            this.user_id = godDetailInfo.user_id;
            this.intro = godDetailInfo.intro;
            this.detail_intro = godDetailInfo.detail_intro;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GodDetailInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new GodDetailInfo(this, z, null) : (GodDetailInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1165217776, "Ltbclient/Profile/GodDetailInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1165217776, "Ltbclient/Profile/GodDetailInfo;");
                return;
            }
        }
        DEFAULT_GOD_ID = 0L;
        DEFAULT_USER_ID = 0L;
    }

    public /* synthetic */ GodDetailInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GodDetailInfo(Builder builder, boolean z) {
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
            Long l = builder.god_id;
            if (l == null) {
                this.god_id = DEFAULT_GOD_ID;
            } else {
                this.god_id = l;
            }
            Long l2 = builder.user_id;
            if (l2 == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l2;
            }
            String str = builder.intro;
            if (str == null) {
                this.intro = "";
            } else {
                this.intro = str;
            }
            String str2 = builder.detail_intro;
            if (str2 == null) {
                this.detail_intro = "";
                return;
            } else {
                this.detail_intro = str2;
                return;
            }
        }
        this.god_id = builder.god_id;
        this.user_id = builder.user_id;
        this.intro = builder.intro;
        this.detail_intro = builder.detail_intro;
    }
}
