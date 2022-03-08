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
public final class GodInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_CAN_SEND_MSG;
    public static final Long DEFAULT_FID;
    public static final Integer DEFAULT_FOLLOWED;
    public static final String DEFAULT_FORUM_NAME = "";
    public static final Long DEFAULT_ID;
    public static final String DEFAULT_INTRO = "";
    public static final String DEFAULT_PREFIX = "";
    public static final String DEFAULT_RECOMMEND_REASON = "";
    public static final Integer DEFAULT_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer can_send_msg;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long fid;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer followed;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String intro;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String prefix;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String recommend_reason;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer type;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GodInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer can_send_msg;
        public Long fid;
        public Integer followed;
        public String forum_name;
        public Long id;
        public String intro;
        public String prefix;
        public String recommend_reason;
        public Integer type;

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
        public Builder(GodInfo godInfo) {
            super(godInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {godInfo};
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
            if (godInfo == null) {
                return;
            }
            this.id = godInfo.id;
            this.intro = godInfo.intro;
            this.type = godInfo.type;
            this.fid = godInfo.fid;
            this.followed = godInfo.followed;
            this.recommend_reason = godInfo.recommend_reason;
            this.forum_name = godInfo.forum_name;
            this.can_send_msg = godInfo.can_send_msg;
            this.prefix = godInfo.prefix;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GodInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new GodInfo(this, z, null) : (GodInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(2057186587, "Ltbclient/GodInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(2057186587, "Ltbclient/GodInfo;");
                return;
            }
        }
        DEFAULT_ID = 0L;
        DEFAULT_TYPE = 0;
        DEFAULT_FID = 0L;
        DEFAULT_FOLLOWED = 0;
        DEFAULT_CAN_SEND_MSG = 0;
    }

    public /* synthetic */ GodInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GodInfo(Builder builder, boolean z) {
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
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            String str = builder.intro;
            if (str == null) {
                this.intro = "";
            } else {
                this.intro = str;
            }
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            Long l2 = builder.fid;
            if (l2 == null) {
                this.fid = DEFAULT_FID;
            } else {
                this.fid = l2;
            }
            Integer num2 = builder.followed;
            if (num2 == null) {
                this.followed = DEFAULT_FOLLOWED;
            } else {
                this.followed = num2;
            }
            String str2 = builder.recommend_reason;
            if (str2 == null) {
                this.recommend_reason = "";
            } else {
                this.recommend_reason = str2;
            }
            String str3 = builder.forum_name;
            if (str3 == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str3;
            }
            Integer num3 = builder.can_send_msg;
            if (num3 == null) {
                this.can_send_msg = DEFAULT_CAN_SEND_MSG;
            } else {
                this.can_send_msg = num3;
            }
            String str4 = builder.prefix;
            if (str4 == null) {
                this.prefix = "";
                return;
            } else {
                this.prefix = str4;
                return;
            }
        }
        this.id = builder.id;
        this.intro = builder.intro;
        this.type = builder.type;
        this.fid = builder.fid;
        this.followed = builder.followed;
        this.recommend_reason = builder.recommend_reason;
        this.forum_name = builder.forum_name;
        this.can_send_msg = builder.can_send_msg;
        this.prefix = builder.prefix;
    }
}
