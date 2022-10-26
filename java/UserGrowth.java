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
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class UserGrowth extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_LEVEL_ID;
    public static final Long DEFAULT_SCORE;
    public static final Long DEFAULT_TARGET_SCORE;
    public static final List<UserTaskInfo> DEFAULT_TASK_INFO;
    public static final Double DEFAULT_TMONEY;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer level_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long score;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long target_score;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<UserTaskInfo> task_info;
    @ProtoField(tag = 4, type = Message.Datatype.DOUBLE)
    public final Double tmoney;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer level_id;
        public Long score;
        public Long target_score;
        public List task_info;
        public Double tmoney;

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
        public Builder(UserGrowth userGrowth) {
            super(userGrowth);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {userGrowth};
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
            if (userGrowth == null) {
                return;
            }
            this.level_id = userGrowth.level_id;
            this.score = userGrowth.score;
            this.target_score = userGrowth.target_score;
            this.tmoney = userGrowth.tmoney;
            this.task_info = Message.copyOf(userGrowth.task_info);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserGrowth build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new UserGrowth(this, z, null);
            }
            return (UserGrowth) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1604536799, "Ltbclient/UserGrowth;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1604536799, "Ltbclient/UserGrowth;");
                return;
            }
        }
        DEFAULT_LEVEL_ID = 0;
        DEFAULT_SCORE = 0L;
        DEFAULT_TARGET_SCORE = 0L;
        DEFAULT_TMONEY = Double.valueOf(0.0d);
        DEFAULT_TASK_INFO = Collections.emptyList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserGrowth(Builder builder, boolean z) {
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
            Integer num = builder.level_id;
            if (num == null) {
                this.level_id = DEFAULT_LEVEL_ID;
            } else {
                this.level_id = num;
            }
            Long l = builder.score;
            if (l == null) {
                this.score = DEFAULT_SCORE;
            } else {
                this.score = l;
            }
            Long l2 = builder.target_score;
            if (l2 == null) {
                this.target_score = DEFAULT_TARGET_SCORE;
            } else {
                this.target_score = l2;
            }
            Double d = builder.tmoney;
            if (d == null) {
                this.tmoney = DEFAULT_TMONEY;
            } else {
                this.tmoney = d;
            }
            List list = builder.task_info;
            if (list == null) {
                this.task_info = DEFAULT_TASK_INFO;
                return;
            } else {
                this.task_info = Message.immutableCopyOf(list);
                return;
            }
        }
        this.level_id = builder.level_id;
        this.score = builder.score;
        this.target_score = builder.target_score;
        this.tmoney = builder.tmoney;
        this.task_info = Message.immutableCopyOf(builder.task_info);
    }

    public /* synthetic */ UserGrowth(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
