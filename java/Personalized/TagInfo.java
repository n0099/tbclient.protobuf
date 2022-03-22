package tbclient.Personalized;

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
    public static final Long DEFAULT_LEGO_PAGE_ID;
    public static final String DEFAULT_LEGO_QS = "";
    public static final String DEFAULT_STAT_KEY = "";
    public static final Long DEFAULT_TAG_CODE;
    public static final String DEFAULT_TAG_NAME = "";
    public static final Integer DEFAULT_TAG_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long lego_page_id;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String lego_qs;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String stat_key;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long tag_code;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tag_name;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer tag_type;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<TagInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long lego_page_id;
        public String lego_qs;
        public String stat_key;
        public Long tag_code;
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
            this.tag_code = tagInfo.tag_code;
            this.tag_name = tagInfo.tag_name;
            this.tag_type = tagInfo.tag_type;
            this.stat_key = tagInfo.stat_key;
            this.lego_page_id = tagInfo.lego_page_id;
            this.lego_qs = tagInfo.lego_qs;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1324263080, "Ltbclient/Personalized/TagInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1324263080, "Ltbclient/Personalized/TagInfo;");
                return;
            }
        }
        DEFAULT_TAG_CODE = 0L;
        DEFAULT_TAG_TYPE = 0;
        DEFAULT_LEGO_PAGE_ID = 0L;
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
            Long l = builder.tag_code;
            if (l == null) {
                this.tag_code = DEFAULT_TAG_CODE;
            } else {
                this.tag_code = l;
            }
            String str = builder.tag_name;
            if (str == null) {
                this.tag_name = "";
            } else {
                this.tag_name = str;
            }
            Integer num = builder.tag_type;
            if (num == null) {
                this.tag_type = DEFAULT_TAG_TYPE;
            } else {
                this.tag_type = num;
            }
            String str2 = builder.stat_key;
            if (str2 == null) {
                this.stat_key = "";
            } else {
                this.stat_key = str2;
            }
            Long l2 = builder.lego_page_id;
            if (l2 == null) {
                this.lego_page_id = DEFAULT_LEGO_PAGE_ID;
            } else {
                this.lego_page_id = l2;
            }
            String str3 = builder.lego_qs;
            if (str3 == null) {
                this.lego_qs = "";
                return;
            } else {
                this.lego_qs = str3;
                return;
            }
        }
        this.tag_code = builder.tag_code;
        this.tag_name = builder.tag_name;
        this.tag_type = builder.tag_type;
        this.stat_key = builder.stat_key;
        this.lego_page_id = builder.lego_page_id;
        this.lego_qs = builder.lego_qs;
    }
}
