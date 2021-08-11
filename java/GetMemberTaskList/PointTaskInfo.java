package tbclient.GetMemberTaskList;

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
public final class PointTaskInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_IS_FINISH;
    public static final Integer DEFAULT_POINTS_ADD;
    public static final Long DEFAULT_TASK_ID;
    public static final String DEFAULT_TASK_INTRO = "";
    public static final String DEFAULT_TASK_NAME = "";
    public static final Integer DEFAULT_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_finish;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer points_add;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long task_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String task_intro;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String task_name;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer type;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<PointTaskInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer is_finish;
        public Integer points_add;
        public Long task_id;
        public String task_intro;
        public String task_name;
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
        public Builder(PointTaskInfo pointTaskInfo) {
            super(pointTaskInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {pointTaskInfo};
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
            if (pointTaskInfo == null) {
                return;
            }
            this.task_id = pointTaskInfo.task_id;
            this.task_name = pointTaskInfo.task_name;
            this.task_intro = pointTaskInfo.task_intro;
            this.is_finish = pointTaskInfo.is_finish;
            this.type = pointTaskInfo.type;
            this.points_add = pointTaskInfo.points_add;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PointTaskInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new PointTaskInfo(this, z, null) : (PointTaskInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-141165506, "Ltbclient/GetMemberTaskList/PointTaskInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-141165506, "Ltbclient/GetMemberTaskList/PointTaskInfo;");
                return;
            }
        }
        DEFAULT_TASK_ID = 0L;
        DEFAULT_IS_FINISH = 0;
        DEFAULT_TYPE = 0;
        DEFAULT_POINTS_ADD = 0;
    }

    public /* synthetic */ PointTaskInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointTaskInfo(Builder builder, boolean z) {
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
            Long l = builder.task_id;
            if (l == null) {
                this.task_id = DEFAULT_TASK_ID;
            } else {
                this.task_id = l;
            }
            String str = builder.task_name;
            if (str == null) {
                this.task_name = "";
            } else {
                this.task_name = str;
            }
            String str2 = builder.task_intro;
            if (str2 == null) {
                this.task_intro = "";
            } else {
                this.task_intro = str2;
            }
            Integer num = builder.is_finish;
            if (num == null) {
                this.is_finish = DEFAULT_IS_FINISH;
            } else {
                this.is_finish = num;
            }
            Integer num2 = builder.type;
            if (num2 == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num2;
            }
            Integer num3 = builder.points_add;
            if (num3 == null) {
                this.points_add = DEFAULT_POINTS_ADD;
                return;
            } else {
                this.points_add = num3;
                return;
            }
        }
        this.task_id = builder.task_id;
        this.task_name = builder.task_name;
        this.task_intro = builder.task_intro;
        this.is_finish = builder.is_finish;
        this.type = builder.type;
        this.points_add = builder.points_add;
    }
}
