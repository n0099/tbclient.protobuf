package tbclient.FrsPage;

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
/* loaded from: classes8.dex */
public final class TagInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_COLOR;
    public static final Long DEFAULT_FORUM_ID;
    public static final Integer DEFAULT_HOT_VALUE;
    public static final Integer DEFAULT_INFLUENCE;
    public static final Integer DEFAULT_OP_TIME;
    public static final Integer DEFAULT_RELATION_WEIGHT;
    public static final Integer DEFAULT_TAG_ID;
    public static final Integer DEFAULT_TAG_LEVEL;
    public static final String DEFAULT_TAG_NAME = "";
    public static final Integer DEFAULT_TAG_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer color;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer hot_value;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer influence;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer op_time;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer relation_weight;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer tag_id;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer tag_level;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String tag_name;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer tag_type;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<TagInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer color;
        public Long forum_id;
        public Integer hot_value;
        public Integer influence;
        public Integer op_time;
        public Integer relation_weight;
        public Integer tag_id;
        public Integer tag_level;
        public String tag_name;
        public Integer tag_type;

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
        public Builder(TagInfo tagInfo) {
            super(tagInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {tagInfo};
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
            if (tagInfo == null) {
                return;
            }
            this.forum_id = tagInfo.forum_id;
            this.tag_id = tagInfo.tag_id;
            this.tag_name = tagInfo.tag_name;
            this.color = tagInfo.color;
            this.hot_value = tagInfo.hot_value;
            this.tag_type = tagInfo.tag_type;
            this.tag_level = tagInfo.tag_level;
            this.influence = tagInfo.influence;
            this.relation_weight = tagInfo.relation_weight;
            this.op_time = tagInfo.op_time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TagInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new TagInfo(this, z, null) : (TagInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(483624054, "Ltbclient/FrsPage/TagInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(483624054, "Ltbclient/FrsPage/TagInfo;");
                return;
            }
        }
        DEFAULT_FORUM_ID = 0L;
        DEFAULT_TAG_ID = 0;
        DEFAULT_COLOR = 0;
        DEFAULT_HOT_VALUE = 0;
        DEFAULT_TAG_TYPE = 0;
        DEFAULT_TAG_LEVEL = 0;
        DEFAULT_INFLUENCE = 0;
        DEFAULT_RELATION_WEIGHT = 0;
        DEFAULT_OP_TIME = 0;
    }

    public /* synthetic */ TagInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagInfo(Builder builder, boolean z) {
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
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            Integer num = builder.tag_id;
            if (num == null) {
                this.tag_id = DEFAULT_TAG_ID;
            } else {
                this.tag_id = num;
            }
            String str = builder.tag_name;
            if (str == null) {
                this.tag_name = "";
            } else {
                this.tag_name = str;
            }
            Integer num2 = builder.color;
            if (num2 == null) {
                this.color = DEFAULT_COLOR;
            } else {
                this.color = num2;
            }
            Integer num3 = builder.hot_value;
            if (num3 == null) {
                this.hot_value = DEFAULT_HOT_VALUE;
            } else {
                this.hot_value = num3;
            }
            Integer num4 = builder.tag_type;
            if (num4 == null) {
                this.tag_type = DEFAULT_TAG_TYPE;
            } else {
                this.tag_type = num4;
            }
            Integer num5 = builder.tag_level;
            if (num5 == null) {
                this.tag_level = DEFAULT_TAG_LEVEL;
            } else {
                this.tag_level = num5;
            }
            Integer num6 = builder.influence;
            if (num6 == null) {
                this.influence = DEFAULT_INFLUENCE;
            } else {
                this.influence = num6;
            }
            Integer num7 = builder.relation_weight;
            if (num7 == null) {
                this.relation_weight = DEFAULT_RELATION_WEIGHT;
            } else {
                this.relation_weight = num7;
            }
            Integer num8 = builder.op_time;
            if (num8 == null) {
                this.op_time = DEFAULT_OP_TIME;
                return;
            } else {
                this.op_time = num8;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.tag_id = builder.tag_id;
        this.tag_name = builder.tag_name;
        this.color = builder.color;
        this.hot_value = builder.hot_value;
        this.tag_type = builder.tag_type;
        this.tag_level = builder.tag_level;
        this.influence = builder.influence;
        this.relation_weight = builder.relation_weight;
        this.op_time = builder.op_time;
    }
}
