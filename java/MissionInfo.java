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
public final class MissionInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_ACTIVITYID;
    public static final Integer DEFAULT_BROWSETIME;
    public static final String DEFAULT_BROWSETIMEPAGE = "";
    public static final Integer DEFAULT_CLEARTIME;
    public static final Integer DEFAULT_CLEARTYPE;
    public static final Integer DEFAULT_MISSIONID;
    public static final Integer DEFAULT_TASKTYPE;
    public static final Integer DEFAULT_THREADNUM;
    public static final Integer DEFAULT_TOTAL_LIMIT;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer activityid;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer browsetime;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String browsetimepage;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer cleartime;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer cleartype;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer missionid;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer tasktype;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer threadnum;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer total_limit;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<MissionInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer activityid;
        public Integer browsetime;
        public String browsetimepage;
        public Integer cleartime;
        public Integer cleartype;
        public Integer missionid;
        public Integer tasktype;
        public Integer threadnum;
        public Integer total_limit;

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
        public Builder(MissionInfo missionInfo) {
            super(missionInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {missionInfo};
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
            if (missionInfo == null) {
                return;
            }
            this.missionid = missionInfo.missionid;
            this.total_limit = missionInfo.total_limit;
            this.browsetime = missionInfo.browsetime;
            this.tasktype = missionInfo.tasktype;
            this.threadnum = missionInfo.threadnum;
            this.browsetimepage = missionInfo.browsetimepage;
            this.activityid = missionInfo.activityid;
            this.cleartype = missionInfo.cleartype;
            this.cleartime = missionInfo.cleartime;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MissionInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new MissionInfo(this, z, null) : (MissionInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1618484981, "Ltbclient/MissionInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1618484981, "Ltbclient/MissionInfo;");
                return;
            }
        }
        DEFAULT_MISSIONID = 0;
        DEFAULT_TOTAL_LIMIT = 0;
        DEFAULT_BROWSETIME = 0;
        DEFAULT_TASKTYPE = 0;
        DEFAULT_THREADNUM = 0;
        DEFAULT_ACTIVITYID = 0;
        DEFAULT_CLEARTYPE = 0;
        DEFAULT_CLEARTIME = 0;
    }

    public /* synthetic */ MissionInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissionInfo(Builder builder, boolean z) {
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
            Integer num = builder.missionid;
            if (num == null) {
                this.missionid = DEFAULT_MISSIONID;
            } else {
                this.missionid = num;
            }
            Integer num2 = builder.total_limit;
            if (num2 == null) {
                this.total_limit = DEFAULT_TOTAL_LIMIT;
            } else {
                this.total_limit = num2;
            }
            Integer num3 = builder.browsetime;
            if (num3 == null) {
                this.browsetime = DEFAULT_BROWSETIME;
            } else {
                this.browsetime = num3;
            }
            Integer num4 = builder.tasktype;
            if (num4 == null) {
                this.tasktype = DEFAULT_TASKTYPE;
            } else {
                this.tasktype = num4;
            }
            Integer num5 = builder.threadnum;
            if (num5 == null) {
                this.threadnum = DEFAULT_THREADNUM;
            } else {
                this.threadnum = num5;
            }
            String str = builder.browsetimepage;
            if (str == null) {
                this.browsetimepage = "";
            } else {
                this.browsetimepage = str;
            }
            Integer num6 = builder.activityid;
            if (num6 == null) {
                this.activityid = DEFAULT_ACTIVITYID;
            } else {
                this.activityid = num6;
            }
            Integer num7 = builder.cleartype;
            if (num7 == null) {
                this.cleartype = DEFAULT_CLEARTYPE;
            } else {
                this.cleartype = num7;
            }
            Integer num8 = builder.cleartime;
            if (num8 == null) {
                this.cleartime = DEFAULT_CLEARTIME;
                return;
            } else {
                this.cleartime = num8;
                return;
            }
        }
        this.missionid = builder.missionid;
        this.total_limit = builder.total_limit;
        this.browsetime = builder.browsetime;
        this.tasktype = builder.tasktype;
        this.threadnum = builder.threadnum;
        this.browsetimepage = builder.browsetimepage;
        this.activityid = builder.activityid;
        this.cleartype = builder.cleartype;
        this.cleartime = builder.cleartime;
    }
}
