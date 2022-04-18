package tbclient.TopicList;

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
public final class TopicListModule extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_MODULE_TITLE = "";
    public static final String DEFAULT_RULE_JUMP_URL = "";
    public static final String DEFAULT_TIPS = "";
    public static final List<TopicList> DEFAULT_TOPIC_LIST;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String module_title;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String rule_jump_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String tips;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<TopicList> topic_list;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<TopicListModule> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String module_title;
        public String rule_jump_url;
        public String tips;
        public List<TopicList> topic_list;

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
        public Builder(TopicListModule topicListModule) {
            super(topicListModule);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {topicListModule};
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
            if (topicListModule == null) {
                return;
            }
            this.module_title = topicListModule.module_title;
            this.topic_list = Message.copyOf(topicListModule.topic_list);
            this.tips = topicListModule.tips;
            this.rule_jump_url = topicListModule.rule_jump_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TopicListModule build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new TopicListModule(this, z, null) : (TopicListModule) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-625603570, "Ltbclient/TopicList/TopicListModule;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-625603570, "Ltbclient/TopicList/TopicListModule;");
                return;
            }
        }
        DEFAULT_TOPIC_LIST = Collections.emptyList();
    }

    public /* synthetic */ TopicListModule(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicListModule(Builder builder, boolean z) {
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
            String str = builder.module_title;
            if (str == null) {
                this.module_title = "";
            } else {
                this.module_title = str;
            }
            List<TopicList> list = builder.topic_list;
            if (list == null) {
                this.topic_list = DEFAULT_TOPIC_LIST;
            } else {
                this.topic_list = Message.immutableCopyOf(list);
            }
            String str2 = builder.tips;
            if (str2 == null) {
                this.tips = "";
            } else {
                this.tips = str2;
            }
            String str3 = builder.rule_jump_url;
            if (str3 == null) {
                this.rule_jump_url = "";
                return;
            } else {
                this.rule_jump_url = str3;
                return;
            }
        }
        this.module_title = builder.module_title;
        this.topic_list = Message.immutableCopyOf(builder.topic_list);
        this.tips = builder.tips;
        this.rule_jump_url = builder.rule_jump_url;
    }
}
