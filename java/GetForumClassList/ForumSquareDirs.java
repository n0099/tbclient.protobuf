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
import java.util.Collections;
import java.util.List;
/* loaded from: classes8.dex */
public final class ForumSquareDirs extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<ChildDir> DEFAULT_FORUM_LIST;
    public static final Long DEFAULT_ID;
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_PIC = "";
    public static final Long DEFAULT_TIME;
    public static final String DEFAULT_TITLE = "";
    public static final Integer DEFAULT_TORDER;
    public static final Integer DEFAULT_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<ChildDir> forum_list;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String pic;
    @ProtoField(tag = 8, type = Message.Datatype.INT64)
    public final Long time;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer torder;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer type;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<ForumSquareDirs> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<ChildDir> forum_list;
        public Long id;
        public String link;
        public String pic;
        public Long time;
        public String title;
        public Integer torder;
        public Integer type;

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
        public Builder(ForumSquareDirs forumSquareDirs) {
            super(forumSquareDirs);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {forumSquareDirs};
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
            if (forumSquareDirs == null) {
                return;
            }
            this.id = forumSquareDirs.id;
            this.title = forumSquareDirs.title;
            this.torder = forumSquareDirs.torder;
            this.type = forumSquareDirs.type;
            this.link = forumSquareDirs.link;
            this.pic = forumSquareDirs.pic;
            this.forum_list = Message.copyOf(forumSquareDirs.forum_list);
            this.time = forumSquareDirs.time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumSquareDirs build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ForumSquareDirs(this, z, null) : (ForumSquareDirs) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(985195909, "Ltbclient/GetForumClassList/ForumSquareDirs;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(985195909, "Ltbclient/GetForumClassList/ForumSquareDirs;");
                return;
            }
        }
        DEFAULT_ID = 0L;
        DEFAULT_TORDER = 0;
        DEFAULT_TYPE = 0;
        DEFAULT_FORUM_LIST = Collections.emptyList();
        DEFAULT_TIME = 0L;
    }

    public /* synthetic */ ForumSquareDirs(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForumSquareDirs(Builder builder, boolean z) {
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
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            Integer num = builder.torder;
            if (num == null) {
                this.torder = DEFAULT_TORDER;
            } else {
                this.torder = num;
            }
            Integer num2 = builder.type;
            if (num2 == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num2;
            }
            String str2 = builder.link;
            if (str2 == null) {
                this.link = "";
            } else {
                this.link = str2;
            }
            String str3 = builder.pic;
            if (str3 == null) {
                this.pic = "";
            } else {
                this.pic = str3;
            }
            List<ChildDir> list = builder.forum_list;
            if (list == null) {
                this.forum_list = DEFAULT_FORUM_LIST;
            } else {
                this.forum_list = Message.immutableCopyOf(list);
            }
            Long l2 = builder.time;
            if (l2 == null) {
                this.time = DEFAULT_TIME;
                return;
            } else {
                this.time = l2;
                return;
            }
        }
        this.id = builder.id;
        this.title = builder.title;
        this.torder = builder.torder;
        this.type = builder.type;
        this.link = builder.link;
        this.pic = builder.pic;
        this.forum_list = Message.immutableCopyOf(builder.forum_list);
        this.time = builder.time;
    }
}
