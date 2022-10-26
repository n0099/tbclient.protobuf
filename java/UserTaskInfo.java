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
public final class UserTaskInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ACT_TYPE = "";
    public static final String DEFAULT_BRIEF = "";
    public static final Integer DEFAULT_CURR_NUM;
    public static final Long DEFAULT_ID;
    public static final String DEFAULT_NAME = "";
    public static final Integer DEFAULT_STATUS;
    public static final Integer DEFAULT_TARGET_NUM;
    public static final String DEFAULT_TASK_ICON_URL = "";
    public static final Integer DEFAULT_TASK_TYPE;
    public static final Integer DEFAULT_WEIGHT;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String act_type;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String brief;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer curr_num;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer status;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer target_num;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String task_icon_url;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer task_type;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer weight;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String act_type;
        public String brief;
        public Integer curr_num;
        public Long id;
        public String name;
        public Integer status;
        public Integer target_num;
        public String task_icon_url;
        public Integer task_type;
        public Integer weight;

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
        public Builder(UserTaskInfo userTaskInfo) {
            super(userTaskInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {userTaskInfo};
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
            if (userTaskInfo == null) {
                return;
            }
            this.id = userTaskInfo.id;
            this.name = userTaskInfo.name;
            this.brief = userTaskInfo.brief;
            this.task_icon_url = userTaskInfo.task_icon_url;
            this.status = userTaskInfo.status;
            this.target_num = userTaskInfo.target_num;
            this.curr_num = userTaskInfo.curr_num;
            this.task_type = userTaskInfo.task_type;
            this.weight = userTaskInfo.weight;
            this.act_type = userTaskInfo.act_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserTaskInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new UserTaskInfo(this, z, null);
            }
            return (UserTaskInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1648505491, "Ltbclient/UserTaskInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1648505491, "Ltbclient/UserTaskInfo;");
                return;
            }
        }
        DEFAULT_ID = 0L;
        DEFAULT_STATUS = 0;
        DEFAULT_TARGET_NUM = 0;
        DEFAULT_CURR_NUM = 0;
        DEFAULT_TASK_TYPE = 0;
        DEFAULT_WEIGHT = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserTaskInfo(Builder builder, boolean z) {
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
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.brief;
            if (str2 == null) {
                this.brief = "";
            } else {
                this.brief = str2;
            }
            String str3 = builder.task_icon_url;
            if (str3 == null) {
                this.task_icon_url = "";
            } else {
                this.task_icon_url = str3;
            }
            Integer num = builder.status;
            if (num == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = num;
            }
            Integer num2 = builder.target_num;
            if (num2 == null) {
                this.target_num = DEFAULT_TARGET_NUM;
            } else {
                this.target_num = num2;
            }
            Integer num3 = builder.curr_num;
            if (num3 == null) {
                this.curr_num = DEFAULT_CURR_NUM;
            } else {
                this.curr_num = num3;
            }
            Integer num4 = builder.task_type;
            if (num4 == null) {
                this.task_type = DEFAULT_TASK_TYPE;
            } else {
                this.task_type = num4;
            }
            Integer num5 = builder.weight;
            if (num5 == null) {
                this.weight = DEFAULT_WEIGHT;
            } else {
                this.weight = num5;
            }
            String str4 = builder.act_type;
            if (str4 == null) {
                this.act_type = "";
                return;
            } else {
                this.act_type = str4;
                return;
            }
        }
        this.id = builder.id;
        this.name = builder.name;
        this.brief = builder.brief;
        this.task_icon_url = builder.task_icon_url;
        this.status = builder.status;
        this.target_num = builder.target_num;
        this.curr_num = builder.curr_num;
        this.task_type = builder.task_type;
        this.weight = builder.weight;
        this.act_type = builder.act_type;
    }

    public /* synthetic */ UserTaskInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
