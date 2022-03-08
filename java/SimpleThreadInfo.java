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
public final class SimpleThreadInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<Abstract> DEFAULT_ABSTRACT;
    public static final Integer DEFAULT_LAST_TIME_INT;
    public static final Integer DEFAULT_REPLY_NUM;
    public static final Long DEFAULT_THREAD_TYPE;
    public static final Long DEFAULT_TID;
    public static final String DEFAULT_TITLE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<Abstract> _abstract;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer last_time_int;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer reply_num;
    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long thread_type;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long tid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 6)
    public final Zan zan;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<SimpleThreadInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<Abstract> _abstract;
        public Integer last_time_int;
        public Integer reply_num;
        public Long thread_type;
        public Long tid;
        public String title;
        public Zan zan;

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
        public Builder(SimpleThreadInfo simpleThreadInfo) {
            super(simpleThreadInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {simpleThreadInfo};
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
            if (simpleThreadInfo == null) {
                return;
            }
            this.tid = simpleThreadInfo.tid;
            this.title = simpleThreadInfo.title;
            this.reply_num = simpleThreadInfo.reply_num;
            this.last_time_int = simpleThreadInfo.last_time_int;
            this._abstract = Message.copyOf(simpleThreadInfo._abstract);
            this.zan = simpleThreadInfo.zan;
            this.thread_type = simpleThreadInfo.thread_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SimpleThreadInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new SimpleThreadInfo(this, z, null) : (SimpleThreadInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1749734567, "Ltbclient/SimpleThreadInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1749734567, "Ltbclient/SimpleThreadInfo;");
                return;
            }
        }
        DEFAULT_TID = 0L;
        DEFAULT_REPLY_NUM = 0;
        DEFAULT_LAST_TIME_INT = 0;
        DEFAULT_ABSTRACT = Collections.emptyList();
        DEFAULT_THREAD_TYPE = 0L;
    }

    public /* synthetic */ SimpleThreadInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleThreadInfo(Builder builder, boolean z) {
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
            Long l = builder.tid;
            if (l == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            Integer num = builder.reply_num;
            if (num == null) {
                this.reply_num = DEFAULT_REPLY_NUM;
            } else {
                this.reply_num = num;
            }
            Integer num2 = builder.last_time_int;
            if (num2 == null) {
                this.last_time_int = DEFAULT_LAST_TIME_INT;
            } else {
                this.last_time_int = num2;
            }
            List<Abstract> list = builder._abstract;
            if (list == null) {
                this._abstract = DEFAULT_ABSTRACT;
            } else {
                this._abstract = Message.immutableCopyOf(list);
            }
            this.zan = builder.zan;
            Long l2 = builder.thread_type;
            if (l2 == null) {
                this.thread_type = DEFAULT_THREAD_TYPE;
                return;
            } else {
                this.thread_type = l2;
                return;
            }
        }
        this.tid = builder.tid;
        this.title = builder.title;
        this.reply_num = builder.reply_num;
        this.last_time_int = builder.last_time_int;
        this._abstract = Message.immutableCopyOf(builder._abstract);
        this.zan = builder.zan;
        this.thread_type = builder.thread_type;
    }
}
