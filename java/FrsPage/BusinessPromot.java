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
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class BusinessPromot extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_BUTTON_TEXT = "";
    public static final String DEFAULT_BUTTON_TEXT2 = "";
    public static final List<BusinessPromotCommentList> DEFAULT_COMMENT_LIST;
    public static final Long DEFAULT_ID;
    public static final String DEFAULT_IMG = "";
    public static final String DEFAULT_IMG_POPUP = "";
    public static final Integer DEFAULT_JOIN_NUM;
    public static final String DEFAULT_SCHEMA = "";
    public static final String DEFAULT_SCHEMA2 = "";
    public static final List<String> DEFAULT_THIRD_STATISTICS_URL;
    public static final String DEFAULT_THREAD_ID = "";
    public static final String DEFAULT_THREAD_ID2 = "";
    public static final Integer DEFAULT_THREAD_TYPE;
    public static final String DEFAULT_TITLE = "";
    public static final Integer DEFAULT_TYPE;
    public static final String DEFAULT_URL = "";
    public static final String DEFAULT_URL2 = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String button_text;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String button_text2;
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<BusinessPromotCommentList> comment_list;
    @ProtoField(tag = 9, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String img;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String img_popup;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer join_num;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String schema;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String schema2;
    @ProtoField(label = Message.Label.REPEATED, tag = 12, type = Message.Datatype.STRING)
    public final List<String> third_statistics_url;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String thread_id;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String thread_id2;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer thread_type;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String url;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String url2;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<BusinessPromot> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String button_text;
        public String button_text2;
        public List<BusinessPromotCommentList> comment_list;
        public Long id;
        public String img;
        public String img_popup;
        public Integer join_num;
        public String schema;
        public String schema2;
        public List<String> third_statistics_url;
        public String thread_id;
        public String thread_id2;
        public Integer thread_type;
        public String title;
        public Integer type;
        public String url;
        public String url2;

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
        public Builder(BusinessPromot businessPromot) {
            super(businessPromot);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {businessPromot};
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
            if (businessPromot == null) {
                return;
            }
            this.title = businessPromot.title;
            this.img = businessPromot.img;
            this.img_popup = businessPromot.img_popup;
            this.type = businessPromot.type;
            this.thread_id = businessPromot.thread_id;
            this.url = businessPromot.url;
            this.join_num = businessPromot.join_num;
            this.comment_list = Message.copyOf(businessPromot.comment_list);
            this.id = businessPromot.id;
            this.thread_type = businessPromot.thread_type;
            this.schema = businessPromot.schema;
            this.third_statistics_url = Message.copyOf(businessPromot.third_statistics_url);
            this.button_text = businessPromot.button_text;
            this.button_text2 = businessPromot.button_text2;
            this.thread_id2 = businessPromot.thread_id2;
            this.url2 = businessPromot.url2;
            this.schema2 = businessPromot.schema2;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BusinessPromot build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new BusinessPromot(this, z, null) : (BusinessPromot) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1003384755, "Ltbclient/FrsPage/BusinessPromot;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1003384755, "Ltbclient/FrsPage/BusinessPromot;");
                return;
            }
        }
        DEFAULT_TYPE = 0;
        DEFAULT_JOIN_NUM = 0;
        DEFAULT_COMMENT_LIST = Collections.emptyList();
        DEFAULT_ID = 0L;
        DEFAULT_THREAD_TYPE = 0;
        DEFAULT_THIRD_STATISTICS_URL = Collections.emptyList();
    }

    public /* synthetic */ BusinessPromot(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessPromot(Builder builder, boolean z) {
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
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.img;
            if (str2 == null) {
                this.img = "";
            } else {
                this.img = str2;
            }
            String str3 = builder.img_popup;
            if (str3 == null) {
                this.img_popup = "";
            } else {
                this.img_popup = str3;
            }
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str4 = builder.thread_id;
            if (str4 == null) {
                this.thread_id = "";
            } else {
                this.thread_id = str4;
            }
            String str5 = builder.url;
            if (str5 == null) {
                this.url = "";
            } else {
                this.url = str5;
            }
            Integer num2 = builder.join_num;
            if (num2 == null) {
                this.join_num = DEFAULT_JOIN_NUM;
            } else {
                this.join_num = num2;
            }
            List<BusinessPromotCommentList> list = builder.comment_list;
            if (list == null) {
                this.comment_list = DEFAULT_COMMENT_LIST;
            } else {
                this.comment_list = Message.immutableCopyOf(list);
            }
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            Integer num3 = builder.thread_type;
            if (num3 == null) {
                this.thread_type = DEFAULT_THREAD_TYPE;
            } else {
                this.thread_type = num3;
            }
            String str6 = builder.schema;
            if (str6 == null) {
                this.schema = "";
            } else {
                this.schema = str6;
            }
            List<String> list2 = builder.third_statistics_url;
            if (list2 == null) {
                this.third_statistics_url = DEFAULT_THIRD_STATISTICS_URL;
            } else {
                this.third_statistics_url = Message.immutableCopyOf(list2);
            }
            String str7 = builder.button_text;
            if (str7 == null) {
                this.button_text = "";
            } else {
                this.button_text = str7;
            }
            String str8 = builder.button_text2;
            if (str8 == null) {
                this.button_text2 = "";
            } else {
                this.button_text2 = str8;
            }
            String str9 = builder.thread_id2;
            if (str9 == null) {
                this.thread_id2 = "";
            } else {
                this.thread_id2 = str9;
            }
            String str10 = builder.url2;
            if (str10 == null) {
                this.url2 = "";
            } else {
                this.url2 = str10;
            }
            String str11 = builder.schema2;
            if (str11 == null) {
                this.schema2 = "";
                return;
            } else {
                this.schema2 = str11;
                return;
            }
        }
        this.title = builder.title;
        this.img = builder.img;
        this.img_popup = builder.img_popup;
        this.type = builder.type;
        this.thread_id = builder.thread_id;
        this.url = builder.url;
        this.join_num = builder.join_num;
        this.comment_list = Message.immutableCopyOf(builder.comment_list);
        this.id = builder.id;
        this.thread_type = builder.thread_type;
        this.schema = builder.schema;
        this.third_statistics_url = Message.immutableCopyOf(builder.third_statistics_url);
        this.button_text = builder.button_text;
        this.button_text2 = builder.button_text2;
        this.thread_id2 = builder.thread_id2;
        this.url2 = builder.url2;
        this.schema2 = builder.schema2;
    }
}
