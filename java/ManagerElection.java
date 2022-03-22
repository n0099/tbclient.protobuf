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
/* loaded from: classes8.dex */
public final class ManagerElection extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_BEGIN_VOTE_TIME;
    public static final Integer DEFAULT_CAN_VOTE;
    public static final Integer DEFAULT_IS_SHOW_DISTRIBUTE;
    public static final Integer DEFAULT_REMAINDER_TIME;
    public static final Integer DEFAULT_STATUS;
    public static final String DEFAULT_TAIL_TEXT = "";
    public static final List<String> DEFAULT_VOTE_CONDITION;
    public static final List<String> DEFAULT_VOTE_CONDITION_PIC;
    public static final List<String> DEFAULT_VOTE_CONDITION_TITLE;
    public static final Integer DEFAULT_VOTE_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer begin_vote_time;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer can_vote;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer is_show_distribute;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer remainder_time;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer status;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String tail_text;
    @ProtoField(label = Message.Label.REPEATED, tag = 5, type = Message.Datatype.STRING)
    public final List<String> vote_condition;
    @ProtoField(label = Message.Label.REPEATED, tag = 11, type = Message.Datatype.STRING)
    public final List<String> vote_condition_pic;
    @ProtoField(label = Message.Label.REPEATED, tag = 10, type = Message.Datatype.STRING)
    public final List<String> vote_condition_title;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer vote_num;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<ManagerElection> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer begin_vote_time;
        public Integer can_vote;
        public Integer is_show_distribute;
        public Integer remainder_time;
        public Integer status;
        public String tail_text;
        public List<String> vote_condition;
        public List<String> vote_condition_pic;
        public List<String> vote_condition_title;
        public Integer vote_num;

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
        public Builder(ManagerElection managerElection) {
            super(managerElection);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {managerElection};
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
            if (managerElection == null) {
                return;
            }
            this.can_vote = managerElection.can_vote;
            this.vote_num = managerElection.vote_num;
            this.begin_vote_time = managerElection.begin_vote_time;
            this.vote_condition = Message.copyOf(managerElection.vote_condition);
            this.tail_text = managerElection.tail_text;
            this.is_show_distribute = managerElection.is_show_distribute;
            this.remainder_time = managerElection.remainder_time;
            this.status = managerElection.status;
            this.vote_condition_title = Message.copyOf(managerElection.vote_condition_title);
            this.vote_condition_pic = Message.copyOf(managerElection.vote_condition_pic);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ManagerElection build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ManagerElection(this, z, null) : (ManagerElection) invokeZ.objValue;
        }
    }

    /* loaded from: classes8.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1943492351, "Ltbclient/ManagerElection;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1943492351, "Ltbclient/ManagerElection;");
                return;
            }
        }
        DEFAULT_CAN_VOTE = 0;
        DEFAULT_VOTE_NUM = 0;
        DEFAULT_BEGIN_VOTE_TIME = 0;
        DEFAULT_VOTE_CONDITION = Collections.emptyList();
        DEFAULT_IS_SHOW_DISTRIBUTE = 0;
        DEFAULT_REMAINDER_TIME = 0;
        DEFAULT_STATUS = 0;
        DEFAULT_VOTE_CONDITION_TITLE = Collections.emptyList();
        DEFAULT_VOTE_CONDITION_PIC = Collections.emptyList();
    }

    public /* synthetic */ ManagerElection(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagerElection(Builder builder, boolean z) {
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
            Integer num = builder.can_vote;
            if (num == null) {
                this.can_vote = DEFAULT_CAN_VOTE;
            } else {
                this.can_vote = num;
            }
            Integer num2 = builder.vote_num;
            if (num2 == null) {
                this.vote_num = DEFAULT_VOTE_NUM;
            } else {
                this.vote_num = num2;
            }
            Integer num3 = builder.begin_vote_time;
            if (num3 == null) {
                this.begin_vote_time = DEFAULT_BEGIN_VOTE_TIME;
            } else {
                this.begin_vote_time = num3;
            }
            List<String> list = builder.vote_condition;
            if (list == null) {
                this.vote_condition = DEFAULT_VOTE_CONDITION;
            } else {
                this.vote_condition = Message.immutableCopyOf(list);
            }
            String str = builder.tail_text;
            if (str == null) {
                this.tail_text = "";
            } else {
                this.tail_text = str;
            }
            Integer num4 = builder.is_show_distribute;
            if (num4 == null) {
                this.is_show_distribute = DEFAULT_IS_SHOW_DISTRIBUTE;
            } else {
                this.is_show_distribute = num4;
            }
            Integer num5 = builder.remainder_time;
            if (num5 == null) {
                this.remainder_time = DEFAULT_REMAINDER_TIME;
            } else {
                this.remainder_time = num5;
            }
            Integer num6 = builder.status;
            if (num6 == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = num6;
            }
            List<String> list2 = builder.vote_condition_title;
            if (list2 == null) {
                this.vote_condition_title = DEFAULT_VOTE_CONDITION_TITLE;
            } else {
                this.vote_condition_title = Message.immutableCopyOf(list2);
            }
            List<String> list3 = builder.vote_condition_pic;
            if (list3 == null) {
                this.vote_condition_pic = DEFAULT_VOTE_CONDITION_PIC;
                return;
            } else {
                this.vote_condition_pic = Message.immutableCopyOf(list3);
                return;
            }
        }
        this.can_vote = builder.can_vote;
        this.vote_num = builder.vote_num;
        this.begin_vote_time = builder.begin_vote_time;
        this.vote_condition = Message.immutableCopyOf(builder.vote_condition);
        this.tail_text = builder.tail_text;
        this.is_show_distribute = builder.is_show_distribute;
        this.remainder_time = builder.remainder_time;
        this.status = builder.status;
        this.vote_condition_title = Message.immutableCopyOf(builder.vote_condition_title);
        this.vote_condition_pic = Message.immutableCopyOf(builder.vote_condition_pic);
    }
}
