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
public final class TagInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_CLASS_ID;
    public static final Integer DEFAULT_RANK_TYPE;
    public static final Integer DEFAULT_TAB_ID;
    public static final String DEFAULT_TAG_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer class_id;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer rank_type;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer tab_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String tag_name;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<TagInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer class_id;
        public Integer rank_type;
        public Integer tab_id;
        public String tag_name;

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
            this.rank_type = tagInfo.rank_type;
            this.class_id = tagInfo.class_id;
            this.tab_id = tagInfo.tab_id;
            this.tag_name = tagInfo.tag_name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TagInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new TagInfo(this, z, null) : (TagInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-510345027, "Ltbclient/TagInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-510345027, "Ltbclient/TagInfo;");
                return;
            }
        }
        DEFAULT_RANK_TYPE = 0;
        DEFAULT_CLASS_ID = 0;
        DEFAULT_TAB_ID = 0;
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
            Integer num = builder.rank_type;
            if (num == null) {
                this.rank_type = DEFAULT_RANK_TYPE;
            } else {
                this.rank_type = num;
            }
            Integer num2 = builder.class_id;
            if (num2 == null) {
                this.class_id = DEFAULT_CLASS_ID;
            } else {
                this.class_id = num2;
            }
            Integer num3 = builder.tab_id;
            if (num3 == null) {
                this.tab_id = DEFAULT_TAB_ID;
            } else {
                this.tab_id = num3;
            }
            String str = builder.tag_name;
            if (str == null) {
                this.tag_name = "";
                return;
            } else {
                this.tag_name = str;
                return;
            }
        }
        this.rank_type = builder.rank_type;
        this.class_id = builder.class_id;
        this.tab_id = builder.tab_id;
        this.tag_name = builder.tag_name;
    }
}
