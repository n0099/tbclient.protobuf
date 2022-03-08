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
public final class AgreeList extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Long DEFAULT_ID;
    public static final Integer DEFAULT_IS_DEL;
    public static final Integer DEFAULT_TIME;
    public static final Integer DEFAULT_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 8)
    public final User agreeer;
    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long id;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer is_del;
    @ProtoField(tag = 9)
    public final Post post_info;
    @ProtoField(tag = 1)
    public final ThreadInfo thread_info;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer time;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer type;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<AgreeList> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public User agreeer;
        public Long id;
        public Integer is_del;
        public Post post_info;
        public ThreadInfo thread_info;
        public Integer time;
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
        public Builder(AgreeList agreeList) {
            super(agreeList);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {agreeList};
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
            if (agreeList == null) {
                return;
            }
            this.thread_info = agreeList.thread_info;
            this.time = agreeList.time;
            this.is_del = agreeList.is_del;
            this.type = agreeList.type;
            this.id = agreeList.id;
            this.agreeer = agreeList.agreeer;
            this.post_info = agreeList.post_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AgreeList build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new AgreeList(this, z, null) : (AgreeList) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1453213819, "Ltbclient/AgreeList;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1453213819, "Ltbclient/AgreeList;");
                return;
            }
        }
        DEFAULT_TIME = 0;
        DEFAULT_IS_DEL = 0;
        DEFAULT_TYPE = 0;
        DEFAULT_ID = 0L;
    }

    public /* synthetic */ AgreeList(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgreeList(Builder builder, boolean z) {
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
            this.thread_info = builder.thread_info;
            Integer num = builder.time;
            if (num == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = num;
            }
            Integer num2 = builder.is_del;
            if (num2 == null) {
                this.is_del = DEFAULT_IS_DEL;
            } else {
                this.is_del = num2;
            }
            Integer num3 = builder.type;
            if (num3 == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num3;
            }
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            this.agreeer = builder.agreeer;
            this.post_info = builder.post_info;
            return;
        }
        this.thread_info = builder.thread_info;
        this.time = builder.time;
        this.is_del = builder.is_del;
        this.type = builder.type;
        this.id = builder.id;
        this.agreeer = builder.agreeer;
        this.post_info = builder.post_info;
    }
}
