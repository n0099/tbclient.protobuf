package tbclient.ExcPbPage;

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
public final class ExcellentPbThreadInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ABSTRACT = "";
    public static final String DEFAULT_ABTEST = "";
    public static final List<ExcContent> DEFAULT_CONTENT;
    public static final Long DEFAULT_EXCID;
    public static final Long DEFAULT_POST_ID;
    public static final Long DEFAULT_POST_NUM;
    public static final Integer DEFAULT_PUBLISH_TIME;
    public static final Integer DEFAULT_SOURCE;
    public static final Long DEFAULT_TAG_CODE;
    public static final String DEFAULT_TAG_NAME = "";
    public static final Long DEFAULT_THREAD_ID;
    public static final String DEFAULT_TITLE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String abtest;
    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<ExcContent> content;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long excid;
    @ProtoField(tag = 8)
    public final postForumInfo forum;
    @ProtoField(tag = 12, type = Message.Datatype.UINT64)
    public final Long post_id;
    @ProtoField(tag = 14, type = Message.Datatype.UINT64)
    public final Long post_num;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer publish_time;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer source;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long tag_code;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String tag_name;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long thread_id;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 13)
    public final ZanInfo zan;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ExcellentPbThreadInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String _abstract;
        public String abtest;
        public List<ExcContent> content;
        public Long excid;
        public postForumInfo forum;
        public Long post_id;
        public Long post_num;
        public Integer publish_time;
        public Integer source;
        public Long tag_code;
        public String tag_name;
        public Long thread_id;
        public String title;
        public ZanInfo zan;

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
        public Builder(ExcellentPbThreadInfo excellentPbThreadInfo) {
            super(excellentPbThreadInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {excellentPbThreadInfo};
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
            if (excellentPbThreadInfo == null) {
                return;
            }
            this.excid = excellentPbThreadInfo.excid;
            this.thread_id = excellentPbThreadInfo.thread_id;
            this.tag_code = excellentPbThreadInfo.tag_code;
            this.tag_name = excellentPbThreadInfo.tag_name;
            this.title = excellentPbThreadInfo.title;
            this._abstract = excellentPbThreadInfo._abstract;
            this.content = Message.copyOf(excellentPbThreadInfo.content);
            this.forum = excellentPbThreadInfo.forum;
            this.abtest = excellentPbThreadInfo.abtest;
            this.source = excellentPbThreadInfo.source;
            this.publish_time = excellentPbThreadInfo.publish_time;
            this.post_id = excellentPbThreadInfo.post_id;
            this.zan = excellentPbThreadInfo.zan;
            this.post_num = excellentPbThreadInfo.post_num;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ExcellentPbThreadInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ExcellentPbThreadInfo(this, z, null) : (ExcellentPbThreadInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-918376829, "Ltbclient/ExcPbPage/ExcellentPbThreadInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-918376829, "Ltbclient/ExcPbPage/ExcellentPbThreadInfo;");
                return;
            }
        }
        DEFAULT_EXCID = 0L;
        DEFAULT_THREAD_ID = 0L;
        DEFAULT_TAG_CODE = 0L;
        DEFAULT_CONTENT = Collections.emptyList();
        DEFAULT_SOURCE = 0;
        DEFAULT_PUBLISH_TIME = 0;
        DEFAULT_POST_ID = 0L;
        DEFAULT_POST_NUM = 0L;
    }

    public /* synthetic */ ExcellentPbThreadInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExcellentPbThreadInfo(Builder builder, boolean z) {
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
            Long l = builder.excid;
            if (l == null) {
                this.excid = DEFAULT_EXCID;
            } else {
                this.excid = l;
            }
            Long l2 = builder.thread_id;
            if (l2 == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l2;
            }
            Long l3 = builder.tag_code;
            if (l3 == null) {
                this.tag_code = DEFAULT_TAG_CODE;
            } else {
                this.tag_code = l3;
            }
            String str = builder.tag_name;
            if (str == null) {
                this.tag_name = "";
            } else {
                this.tag_name = str;
            }
            String str2 = builder.title;
            if (str2 == null) {
                this.title = "";
            } else {
                this.title = str2;
            }
            String str3 = builder._abstract;
            if (str3 == null) {
                this._abstract = "";
            } else {
                this._abstract = str3;
            }
            List<ExcContent> list = builder.content;
            if (list == null) {
                this.content = DEFAULT_CONTENT;
            } else {
                this.content = Message.immutableCopyOf(list);
            }
            this.forum = builder.forum;
            String str4 = builder.abtest;
            if (str4 == null) {
                this.abtest = "";
            } else {
                this.abtest = str4;
            }
            Integer num = builder.source;
            if (num == null) {
                this.source = DEFAULT_SOURCE;
            } else {
                this.source = num;
            }
            Integer num2 = builder.publish_time;
            if (num2 == null) {
                this.publish_time = DEFAULT_PUBLISH_TIME;
            } else {
                this.publish_time = num2;
            }
            Long l4 = builder.post_id;
            if (l4 == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = l4;
            }
            this.zan = builder.zan;
            Long l5 = builder.post_num;
            if (l5 == null) {
                this.post_num = DEFAULT_POST_NUM;
                return;
            } else {
                this.post_num = l5;
                return;
            }
        }
        this.excid = builder.excid;
        this.thread_id = builder.thread_id;
        this.tag_code = builder.tag_code;
        this.tag_name = builder.tag_name;
        this.title = builder.title;
        this._abstract = builder._abstract;
        this.content = Message.immutableCopyOf(builder.content);
        this.forum = builder.forum;
        this.abtest = builder.abtest;
        this.source = builder.source;
        this.publish_time = builder.publish_time;
        this.post_id = builder.post_id;
        this.zan = builder.zan;
        this.post_num = builder.post_num;
    }
}
