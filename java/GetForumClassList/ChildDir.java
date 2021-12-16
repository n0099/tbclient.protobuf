package tbclient.GetForumClassList;

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
/* loaded from: classes4.dex */
public final class ChildDir extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_EXPLAIN = "";
    public static final Long DEFAULT_FORUM_LID;
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_LINK = "";
    public static final Long DEFAULT_MEMBER_COUNT;
    public static final String DEFAULT_TAG = "";
    public static final Long DEFAULT_THREAD_NUM;
    public static final Long DEFAULT_TORDER;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String explain;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_lid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 9, type = Message.Datatype.INT64)
    public final Long member_count;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String tag;
    @ProtoField(tag = 10, type = Message.Datatype.INT64)
    public final Long thread_num;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long torder;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<ChildDir> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String avatar;
        public String desc;
        public String explain;
        public Long forum_lid;
        public String forum_name;
        public String link;
        public Long member_count;
        public String tag;
        public Long thread_num;
        public Long torder;

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
        public Builder(ChildDir childDir) {
            super(childDir);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {childDir};
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
            if (childDir == null) {
                return;
            }
            this.forum_lid = childDir.forum_lid;
            this.forum_name = childDir.forum_name;
            this.torder = childDir.torder;
            this.explain = childDir.explain;
            this.tag = childDir.tag;
            this.link = childDir.link;
            this.avatar = childDir.avatar;
            this.desc = childDir.desc;
            this.member_count = childDir.member_count;
            this.thread_num = childDir.thread_num;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ChildDir build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ChildDir(this, z, null) : (ChildDir) invokeZ.objValue;
        }
    }

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-261953732, "Ltbclient/GetForumClassList/ChildDir;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-261953732, "Ltbclient/GetForumClassList/ChildDir;");
                return;
            }
        }
        DEFAULT_FORUM_LID = 0L;
        DEFAULT_TORDER = 0L;
        DEFAULT_MEMBER_COUNT = 0L;
        DEFAULT_THREAD_NUM = 0L;
    }

    public /* synthetic */ ChildDir(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChildDir(Builder builder, boolean z) {
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
            Long l = builder.forum_lid;
            if (l == null) {
                this.forum_lid = DEFAULT_FORUM_LID;
            } else {
                this.forum_lid = l;
            }
            String str = builder.forum_name;
            if (str == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str;
            }
            Long l2 = builder.torder;
            if (l2 == null) {
                this.torder = DEFAULT_TORDER;
            } else {
                this.torder = l2;
            }
            String str2 = builder.explain;
            if (str2 == null) {
                this.explain = "";
            } else {
                this.explain = str2;
            }
            String str3 = builder.tag;
            if (str3 == null) {
                this.tag = "";
            } else {
                this.tag = str3;
            }
            String str4 = builder.link;
            if (str4 == null) {
                this.link = "";
            } else {
                this.link = str4;
            }
            String str5 = builder.avatar;
            if (str5 == null) {
                this.avatar = "";
            } else {
                this.avatar = str5;
            }
            String str6 = builder.desc;
            if (str6 == null) {
                this.desc = "";
            } else {
                this.desc = str6;
            }
            Long l3 = builder.member_count;
            if (l3 == null) {
                this.member_count = DEFAULT_MEMBER_COUNT;
            } else {
                this.member_count = l3;
            }
            Long l4 = builder.thread_num;
            if (l4 == null) {
                this.thread_num = DEFAULT_THREAD_NUM;
                return;
            } else {
                this.thread_num = l4;
                return;
            }
        }
        this.forum_lid = builder.forum_lid;
        this.forum_name = builder.forum_name;
        this.torder = builder.torder;
        this.explain = builder.explain;
        this.tag = builder.tag;
        this.link = builder.link;
        this.avatar = builder.avatar;
        this.desc = builder.desc;
        this.member_count = builder.member_count;
        this.thread_num = builder.thread_num;
    }
}
