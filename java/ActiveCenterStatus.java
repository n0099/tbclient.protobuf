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
/* loaded from: classes2.dex */
public final class ActiveCenterStatus extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_DAY;
    public static final String DEFAULT_DESC = "";
    public static final Integer DEFAULT_IS_COMPLETED;
    public static final Integer DEFAULT_IS_TODAY_MISSION;
    public static final String DEFAULT_MISSION = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer day;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_completed;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_today_mission;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String mission;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ActiveCenterStatus> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer day;
        public String desc;
        public Integer is_completed;
        public Integer is_today_mission;
        public String mission;

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
        public Builder(ActiveCenterStatus activeCenterStatus) {
            super(activeCenterStatus);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {activeCenterStatus};
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
            if (activeCenterStatus == null) {
                return;
            }
            this.day = activeCenterStatus.day;
            this.is_completed = activeCenterStatus.is_completed;
            this.mission = activeCenterStatus.mission;
            this.is_today_mission = activeCenterStatus.is_today_mission;
            this.desc = activeCenterStatus.desc;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ActiveCenterStatus build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ActiveCenterStatus(this, z, null) : (ActiveCenterStatus) invokeZ.objValue;
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(621348324, "Ltbclient/ActiveCenterStatus;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(621348324, "Ltbclient/ActiveCenterStatus;");
                return;
            }
        }
        DEFAULT_DAY = 0;
        DEFAULT_IS_COMPLETED = 0;
        DEFAULT_IS_TODAY_MISSION = 0;
    }

    public /* synthetic */ ActiveCenterStatus(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActiveCenterStatus(Builder builder, boolean z) {
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
            Integer num = builder.day;
            if (num == null) {
                this.day = DEFAULT_DAY;
            } else {
                this.day = num;
            }
            Integer num2 = builder.is_completed;
            if (num2 == null) {
                this.is_completed = DEFAULT_IS_COMPLETED;
            } else {
                this.is_completed = num2;
            }
            String str = builder.mission;
            if (str == null) {
                this.mission = "";
            } else {
                this.mission = str;
            }
            Integer num3 = builder.is_today_mission;
            if (num3 == null) {
                this.is_today_mission = DEFAULT_IS_TODAY_MISSION;
            } else {
                this.is_today_mission = num3;
            }
            String str2 = builder.desc;
            if (str2 == null) {
                this.desc = "";
                return;
            } else {
                this.desc = str2;
                return;
            }
        }
        this.day = builder.day;
        this.is_completed = builder.is_completed;
        this.mission = builder.mission;
        this.is_today_mission = builder.is_today_mission;
        this.desc = builder.desc;
    }
}
