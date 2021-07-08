package tbclient.FinePbPage;

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
public final class ForumInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ABSTRACT = "";
    public static final String DEFAULT_AUTHORREMARK = "";
    public static final String DEFAULT_AVATAR = "";
    public static final List<Content> DEFAULT_CONTENT;
    public static final Long DEFAULT_FROMFID;
    public static final String DEFAULT_FROMFNAME = "";
    public static final Long DEFAULT_FTID;
    public static final Integer DEFAULT_IS_LIKE;
    public static final Long DEFAULT_MEMBER_NUM;
    public static final String DEFAULT_ORIGINALURL = "";
    public static final Long DEFAULT_PID;
    public static final String DEFAULT_TAG = "";
    public static final String DEFAULT_TAGABSTRACT = "";
    public static final Long DEFAULT_THREADSNUM;
    public static final Long DEFAULT_TID;
    public static final String DEFAULT_TITLE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String authorremark;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<Content> content;
    @ProtoField(tag = 9, type = Message.Datatype.UINT64)
    public final Long fromfid;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String fromfname;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long ftid;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer is_like;
    @ProtoField(tag = 11, type = Message.Datatype.UINT64)
    public final Long member_num;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String originalurl;
    @ProtoField(tag = 17, type = Message.Datatype.UINT64)
    public final Long pid;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String tag;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String tagabstract;
    @ProtoField(tag = 10, type = Message.Datatype.UINT64)
    public final Long threadsnum;
    @ProtoField(tag = 16, type = Message.Datatype.UINT64)
    public final Long tid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 5)
    public final ZanInfo zan;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ForumInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String _abstract;
        public String authorremark;
        public String avatar;
        public List<Content> content;
        public Long fromfid;
        public String fromfname;
        public Long ftid;
        public Integer is_like;
        public Long member_num;
        public String originalurl;
        public Long pid;
        public String tag;
        public String tagabstract;
        public Long threadsnum;
        public Long tid;
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
        public Builder(ForumInfo forumInfo) {
            super(forumInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {forumInfo};
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
            if (forumInfo == null) {
                return;
            }
            this.ftid = forumInfo.ftid;
            this.title = forumInfo.title;
            this._abstract = forumInfo._abstract;
            this.content = Message.copyOf(forumInfo.content);
            this.zan = forumInfo.zan;
            this.originalurl = forumInfo.originalurl;
            this.tag = forumInfo.tag;
            this.fromfname = forumInfo.fromfname;
            this.fromfid = forumInfo.fromfid;
            this.threadsnum = forumInfo.threadsnum;
            this.member_num = forumInfo.member_num;
            this.avatar = forumInfo.avatar;
            this.is_like = forumInfo.is_like;
            this.tagabstract = forumInfo.tagabstract;
            this.authorremark = forumInfo.authorremark;
            this.tid = forumInfo.tid;
            this.pid = forumInfo.pid;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ForumInfo(this, z, null) : (ForumInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1469949622, "Ltbclient/FinePbPage/ForumInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1469949622, "Ltbclient/FinePbPage/ForumInfo;");
                return;
            }
        }
        DEFAULT_FTID = 0L;
        DEFAULT_CONTENT = Collections.emptyList();
        DEFAULT_FROMFID = 0L;
        DEFAULT_THREADSNUM = 0L;
        DEFAULT_MEMBER_NUM = 0L;
        DEFAULT_IS_LIKE = 0;
        DEFAULT_TID = 0L;
        DEFAULT_PID = 0L;
    }

    public /* synthetic */ ForumInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForumInfo(Builder builder, boolean z) {
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
            Long l = builder.ftid;
            if (l == null) {
                this.ftid = DEFAULT_FTID;
            } else {
                this.ftid = l;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder._abstract;
            if (str2 == null) {
                this._abstract = "";
            } else {
                this._abstract = str2;
            }
            List<Content> list = builder.content;
            if (list == null) {
                this.content = DEFAULT_CONTENT;
            } else {
                this.content = Message.immutableCopyOf(list);
            }
            this.zan = builder.zan;
            String str3 = builder.originalurl;
            if (str3 == null) {
                this.originalurl = "";
            } else {
                this.originalurl = str3;
            }
            String str4 = builder.tag;
            if (str4 == null) {
                this.tag = "";
            } else {
                this.tag = str4;
            }
            String str5 = builder.fromfname;
            if (str5 == null) {
                this.fromfname = "";
            } else {
                this.fromfname = str5;
            }
            Long l2 = builder.fromfid;
            if (l2 == null) {
                this.fromfid = DEFAULT_FROMFID;
            } else {
                this.fromfid = l2;
            }
            Long l3 = builder.threadsnum;
            if (l3 == null) {
                this.threadsnum = DEFAULT_THREADSNUM;
            } else {
                this.threadsnum = l3;
            }
            Long l4 = builder.member_num;
            if (l4 == null) {
                this.member_num = DEFAULT_MEMBER_NUM;
            } else {
                this.member_num = l4;
            }
            String str6 = builder.avatar;
            if (str6 == null) {
                this.avatar = "";
            } else {
                this.avatar = str6;
            }
            Integer num = builder.is_like;
            if (num == null) {
                this.is_like = DEFAULT_IS_LIKE;
            } else {
                this.is_like = num;
            }
            String str7 = builder.tagabstract;
            if (str7 == null) {
                this.tagabstract = "";
            } else {
                this.tagabstract = str7;
            }
            String str8 = builder.authorremark;
            if (str8 == null) {
                this.authorremark = "";
            } else {
                this.authorremark = str8;
            }
            Long l5 = builder.tid;
            if (l5 == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l5;
            }
            Long l6 = builder.pid;
            if (l6 == null) {
                this.pid = DEFAULT_PID;
                return;
            } else {
                this.pid = l6;
                return;
            }
        }
        this.ftid = builder.ftid;
        this.title = builder.title;
        this._abstract = builder._abstract;
        this.content = Message.immutableCopyOf(builder.content);
        this.zan = builder.zan;
        this.originalurl = builder.originalurl;
        this.tag = builder.tag;
        this.fromfname = builder.fromfname;
        this.fromfid = builder.fromfid;
        this.threadsnum = builder.threadsnum;
        this.member_num = builder.member_num;
        this.avatar = builder.avatar;
        this.is_like = builder.is_like;
        this.tagabstract = builder.tagabstract;
        this.authorremark = builder.authorremark;
        this.tid = builder.tid;
        this.pid = builder.pid;
    }
}
