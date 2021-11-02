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
/* loaded from: classes3.dex */
public final class ActiveCenterMission extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_ACTIVE_ID;
    public static final Integer DEFAULT_CLEARTIME;
    public static final Integer DEFAULT_CLEARTYPE;
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_FINAL_REWARD_URL = "";
    public static final String DEFAULT_MISSION = "";
    public static final Integer DEFAULT_MISSION_ID;
    public static final Integer DEFAULT_TASK_TYPE;
    public static final Integer DEFAULT_TOTAL_LIMIT;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer active_id;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer cleartime;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer cleartype;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String final_reward_url;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String mission;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer mission_id;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer task_type;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer total_limit;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<ActiveCenterMission> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer active_id;
        public Integer cleartime;
        public Integer cleartype;
        public String desc;
        public String final_reward_url;
        public String mission;
        public Integer mission_id;
        public Integer task_type;
        public Integer total_limit;

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
        public Builder(ActiveCenterMission activeCenterMission) {
            super(activeCenterMission);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {activeCenterMission};
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
            if (activeCenterMission == null) {
                return;
            }
            this.active_id = activeCenterMission.active_id;
            this.mission_id = activeCenterMission.mission_id;
            this.task_type = activeCenterMission.task_type;
            this.cleartype = activeCenterMission.cleartype;
            this.cleartime = activeCenterMission.cleartime;
            this.total_limit = activeCenterMission.total_limit;
            this.final_reward_url = activeCenterMission.final_reward_url;
            this.mission = activeCenterMission.mission;
            this.desc = activeCenterMission.desc;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ActiveCenterMission build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ActiveCenterMission(this, z, null) : (ActiveCenterMission) invokeZ.objValue;
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-443562956, "Ltbclient/ActiveCenterMission;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-443562956, "Ltbclient/ActiveCenterMission;");
                return;
            }
        }
        DEFAULT_ACTIVE_ID = 0;
        DEFAULT_MISSION_ID = 0;
        DEFAULT_TASK_TYPE = 0;
        DEFAULT_CLEARTYPE = 0;
        DEFAULT_CLEARTIME = 0;
        DEFAULT_TOTAL_LIMIT = 0;
    }

    public /* synthetic */ ActiveCenterMission(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActiveCenterMission(Builder builder, boolean z) {
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
            Integer num = builder.active_id;
            if (num == null) {
                this.active_id = DEFAULT_ACTIVE_ID;
            } else {
                this.active_id = num;
            }
            Integer num2 = builder.mission_id;
            if (num2 == null) {
                this.mission_id = DEFAULT_MISSION_ID;
            } else {
                this.mission_id = num2;
            }
            Integer num3 = builder.task_type;
            if (num3 == null) {
                this.task_type = DEFAULT_TASK_TYPE;
            } else {
                this.task_type = num3;
            }
            Integer num4 = builder.cleartype;
            if (num4 == null) {
                this.cleartype = DEFAULT_CLEARTYPE;
            } else {
                this.cleartype = num4;
            }
            Integer num5 = builder.cleartime;
            if (num5 == null) {
                this.cleartime = DEFAULT_CLEARTIME;
            } else {
                this.cleartime = num5;
            }
            Integer num6 = builder.total_limit;
            if (num6 == null) {
                this.total_limit = DEFAULT_TOTAL_LIMIT;
            } else {
                this.total_limit = num6;
            }
            String str = builder.final_reward_url;
            if (str == null) {
                this.final_reward_url = "";
            } else {
                this.final_reward_url = str;
            }
            String str2 = builder.mission;
            if (str2 == null) {
                this.mission = "";
            } else {
                this.mission = str2;
            }
            String str3 = builder.desc;
            if (str3 == null) {
                this.desc = "";
                return;
            } else {
                this.desc = str3;
                return;
            }
        }
        this.active_id = builder.active_id;
        this.mission_id = builder.mission_id;
        this.task_type = builder.task_type;
        this.cleartype = builder.cleartype;
        this.cleartime = builder.cleartime;
        this.total_limit = builder.total_limit;
        this.final_reward_url = builder.final_reward_url;
        this.mission = builder.mission;
        this.desc = builder.desc;
    }
}
