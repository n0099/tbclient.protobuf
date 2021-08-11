package tbclient.GetMyPost;

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
/* loaded from: classes2.dex */
public final class Zan extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Long DEFAULT_AUTHOR_ID;
    public static final Integer DEFAULT_IS_LIKED;
    public static final Integer DEFAULT_LAST_TIME;
    public static final List<Long> DEFAULT_LIKER_ID;
    public static final Integer DEFAULT_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long author_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_liked;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer last_time;
    @ProtoField(label = Message.Label.REPEATED, tag = 4, type = Message.Datatype.INT64)
    public final List<Long> liker_id;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer num;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<Zan> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long author_id;
        public Integer is_liked;
        public Integer last_time;
        public List<Long> liker_id;
        public Integer num;

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
        public Builder(Zan zan) {
            super(zan);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {zan};
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
            if (zan == null) {
                return;
            }
            this.num = zan.num;
            this.is_liked = zan.is_liked;
            this.last_time = zan.last_time;
            this.liker_id = Message.copyOf(zan.liker_id);
            this.author_id = zan.author_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Zan build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new Zan(this, z, null) : (Zan) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(850768139, "Ltbclient/GetMyPost/Zan;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(850768139, "Ltbclient/GetMyPost/Zan;");
                return;
            }
        }
        DEFAULT_NUM = 0;
        DEFAULT_IS_LIKED = 0;
        DEFAULT_LAST_TIME = 0;
        DEFAULT_LIKER_ID = Collections.emptyList();
        DEFAULT_AUTHOR_ID = 0L;
    }

    public /* synthetic */ Zan(Builder builder, boolean z, a aVar) {
        this(builder, z);
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
            Integer num = builder.num;
            if (num == null) {
                this.num = DEFAULT_NUM;
            } else {
                this.num = num;
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
            List<Long> list = builder.liker_id;
            if (list == null) {
                this.liker_id = DEFAULT_LIKER_ID;
            } else {
                this.liker_id = Message.immutableCopyOf(list);
            }
            Long l = builder.author_id;
            if (l == null) {
                this.author_id = DEFAULT_AUTHOR_ID;
                return;
            } else {
                this.author_id = l;
                return;
            }
        }
        this.num = builder.num;
        this.is_liked = builder.is_liked;
        this.last_time = builder.last_time;
        this.liker_id = Message.immutableCopyOf(builder.liker_id);
        this.author_id = builder.author_id;
    }
}
