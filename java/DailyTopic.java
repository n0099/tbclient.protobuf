package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class DailyTopic extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_TOPIC_ABSTRACT = "";
    public static final String DEFAULT_TOPIC_PIC = "";
    public static final String DEFAULT_TOPIC_RANK_URL = "";
    public static final String DEFAULT_TOPIC_TITLE = "";
    public static final String DEFAULT_TOPIC_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String topic_abstract;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String topic_pic;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String topic_rank_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String topic_title;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String topic_url;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DailyTopic> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String topic_abstract;
        public String topic_pic;
        public String topic_rank_url;
        public String topic_title;
        public String topic_url;

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
        public Builder(DailyTopic dailyTopic) {
            super(dailyTopic);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dailyTopic};
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
            if (dailyTopic == null) {
                return;
            }
            this.topic_title = dailyTopic.topic_title;
            this.topic_abstract = dailyTopic.topic_abstract;
            this.topic_pic = dailyTopic.topic_pic;
            this.topic_url = dailyTopic.topic_url;
            this.topic_rank_url = dailyTopic.topic_rank_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DailyTopic build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DailyTopic(this, z, null) : (DailyTopic) invokeZ.objValue;
        }
    }

    /* loaded from: classes10.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    public /* synthetic */ DailyTopic(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyTopic(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65536, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65536, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.topic_title;
            if (str == null) {
                this.topic_title = "";
            } else {
                this.topic_title = str;
            }
            String str2 = builder.topic_abstract;
            if (str2 == null) {
                this.topic_abstract = "";
            } else {
                this.topic_abstract = str2;
            }
            String str3 = builder.topic_pic;
            if (str3 == null) {
                this.topic_pic = "";
            } else {
                this.topic_pic = str3;
            }
            String str4 = builder.topic_url;
            if (str4 == null) {
                this.topic_url = "";
            } else {
                this.topic_url = str4;
            }
            String str5 = builder.topic_rank_url;
            if (str5 == null) {
                this.topic_rank_url = "";
                return;
            } else {
                this.topic_rank_url = str5;
                return;
            }
        }
        this.topic_title = builder.topic_title;
        this.topic_abstract = builder.topic_abstract;
        this.topic_pic = builder.topic_pic;
        this.topic_url = builder.topic_url;
        this.topic_rank_url = builder.topic_rank_url;
    }
}
