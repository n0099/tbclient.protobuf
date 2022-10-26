package tbclient.HomePage;

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
public final class HotTopicItem extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_TOPIC_DISCUSS_NUM;
    public static final Long DEFAULT_TOPIC_ID;
    public static final String DEFAULT_TOPIC_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long topic_discuss_num;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long topic_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String topic_name;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long topic_discuss_num;
        public Long topic_id;
        public String topic_name;

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
        public Builder(HotTopicItem hotTopicItem) {
            super(hotTopicItem);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {hotTopicItem};
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
            if (hotTopicItem == null) {
                return;
            }
            this.topic_id = hotTopicItem.topic_id;
            this.topic_name = hotTopicItem.topic_name;
            this.topic_discuss_num = hotTopicItem.topic_discuss_num;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotTopicItem build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new HotTopicItem(this, z, null);
            }
            return (HotTopicItem) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1995094223, "Ltbclient/HomePage/HotTopicItem;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1995094223, "Ltbclient/HomePage/HotTopicItem;");
                return;
            }
        }
        DEFAULT_TOPIC_ID = 0L;
        DEFAULT_TOPIC_DISCUSS_NUM = 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotTopicItem(Builder builder, boolean z) {
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
            Long l = builder.topic_id;
            if (l == null) {
                this.topic_id = DEFAULT_TOPIC_ID;
            } else {
                this.topic_id = l;
            }
            String str = builder.topic_name;
            if (str == null) {
                this.topic_name = "";
            } else {
                this.topic_name = str;
            }
            Long l2 = builder.topic_discuss_num;
            if (l2 == null) {
                this.topic_discuss_num = DEFAULT_TOPIC_DISCUSS_NUM;
                return;
            } else {
                this.topic_discuss_num = l2;
                return;
            }
        }
        this.topic_id = builder.topic_id;
        this.topic_name = builder.topic_name;
        this.topic_discuss_num = builder.topic_discuss_num;
    }

    public /* synthetic */ HotTopicItem(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
