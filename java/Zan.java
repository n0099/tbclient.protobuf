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
public final class Zan extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_CONSENT_TYPE;
    public static final Integer DEFAULT_IS_LIKED;
    public static final Integer DEFAULT_LAST_TIME;
    public static final List<Long> DEFAULT_LIKER_ID;
    public static final List<User> DEFAULT_LIKER_LIST;
    public static final Integer DEFAULT_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer consent_type;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer is_liked;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer last_time;
    @ProtoField(label = Message.Label.REPEATED, tag = 5, type = Message.Datatype.INT64)
    public final List<Long> liker_id;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<User> liker_list;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer num;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer consent_type;
        public Integer is_liked;
        public Integer last_time;
        public List liker_id;
        public List liker_list;
        public Integer num;

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
        public Builder(Zan zan) {
            super(zan);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {zan};
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
            if (zan == null) {
                return;
            }
            this.num = zan.num;
            this.liker_list = Message.copyOf(zan.liker_list);
            this.is_liked = zan.is_liked;
            this.last_time = zan.last_time;
            this.liker_id = Message.copyOf(zan.liker_id);
            this.consent_type = zan.consent_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Zan build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new Zan(this, z, null);
            }
            return (Zan) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(103645918, "Ltbclient/Zan;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(103645918, "Ltbclient/Zan;");
                return;
            }
        }
        DEFAULT_NUM = 0;
        DEFAULT_LIKER_LIST = Collections.emptyList();
        DEFAULT_IS_LIKED = 0;
        DEFAULT_LAST_TIME = 0;
        DEFAULT_LIKER_ID = Collections.emptyList();
        DEFAULT_CONSENT_TYPE = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zan(Builder builder, boolean z) {
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
            Integer num = builder.num;
            if (num == null) {
                this.num = DEFAULT_NUM;
            } else {
                this.num = num;
            }
            List list = builder.liker_list;
            if (list == null) {
                this.liker_list = DEFAULT_LIKER_LIST;
            } else {
                this.liker_list = Message.immutableCopyOf(list);
            }
            Integer num2 = builder.is_liked;
            if (num2 == null) {
                this.is_liked = DEFAULT_IS_LIKED;
            } else {
                this.is_liked = num2;
            }
            Integer num3 = builder.last_time;
            if (num3 == null) {
                this.last_time = DEFAULT_LAST_TIME;
            } else {
                this.last_time = num3;
            }
            List list2 = builder.liker_id;
            if (list2 == null) {
                this.liker_id = DEFAULT_LIKER_ID;
            } else {
                this.liker_id = Message.immutableCopyOf(list2);
            }
            Integer num4 = builder.consent_type;
            if (num4 == null) {
                this.consent_type = DEFAULT_CONSENT_TYPE;
                return;
            } else {
                this.consent_type = num4;
                return;
            }
        }
        this.num = builder.num;
        this.liker_list = Message.immutableCopyOf(builder.liker_list);
        this.is_liked = builder.is_liked;
        this.last_time = builder.last_time;
        this.liker_id = Message.immutableCopyOf(builder.liker_id);
        this.consent_type = builder.consent_type;
    }

    public /* synthetic */ Zan(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
