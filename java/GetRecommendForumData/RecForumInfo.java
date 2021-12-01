package tbclient.GetRecommendForumData;

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
import tbclient.ThemeColorInfo;
/* loaded from: classes4.dex */
public final class RecForumInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_FORUM_ID = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_FROM = "";
    public static final Integer DEFAULT_MEMBER_COUNT;
    public static final Boolean DEFAULT_NEED_TRANS;
    public static final List<ThreadList> DEFAULT_THREADLIST;
    public static final Integer DEFAULT_THREAD_COUNT;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String from;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer member_count;
    @ProtoField(tag = 10, type = Message.Datatype.BOOL)
    public final Boolean need_trans;
    @ProtoField(tag = 9)
    public final ThemeColorInfo theme_color;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer thread_count;
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<ThreadList> threadlist;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<RecForumInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String avatar;
        public String forum_id;
        public String forum_name;
        public String from;
        public Integer member_count;
        public Boolean need_trans;
        public ThemeColorInfo theme_color;
        public Integer thread_count;
        public List<ThreadList> threadlist;

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
        public Builder(RecForumInfo recForumInfo) {
            super(recForumInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {recForumInfo};
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
            if (recForumInfo == null) {
                return;
            }
            this.forum_id = recForumInfo.forum_id;
            this.forum_name = recForumInfo.forum_name;
            this.avatar = recForumInfo.avatar;
            this.member_count = recForumInfo.member_count;
            this.thread_count = recForumInfo.thread_count;
            this.from = recForumInfo.from;
            this.threadlist = Message.copyOf(recForumInfo.threadlist);
            this.theme_color = recForumInfo.theme_color;
            this.need_trans = recForumInfo.need_trans;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecForumInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new RecForumInfo(this, z, null) : (RecForumInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1432081544, "Ltbclient/GetRecommendForumData/RecForumInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1432081544, "Ltbclient/GetRecommendForumData/RecForumInfo;");
                return;
            }
        }
        DEFAULT_MEMBER_COUNT = 0;
        DEFAULT_THREAD_COUNT = 0;
        DEFAULT_THREADLIST = Collections.emptyList();
        DEFAULT_NEED_TRANS = Boolean.FALSE;
    }

    public /* synthetic */ RecForumInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecForumInfo(Builder builder, boolean z) {
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
            String str = builder.forum_id;
            if (str == null) {
                this.forum_id = "";
            } else {
                this.forum_id = str;
            }
            String str2 = builder.forum_name;
            if (str2 == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str2;
            }
            String str3 = builder.avatar;
            if (str3 == null) {
                this.avatar = "";
            } else {
                this.avatar = str3;
            }
            Integer num = builder.member_count;
            if (num == null) {
                this.member_count = DEFAULT_MEMBER_COUNT;
            } else {
                this.member_count = num;
            }
            Integer num2 = builder.thread_count;
            if (num2 == null) {
                this.thread_count = DEFAULT_THREAD_COUNT;
            } else {
                this.thread_count = num2;
            }
            String str4 = builder.from;
            if (str4 == null) {
                this.from = "";
            } else {
                this.from = str4;
            }
            List<ThreadList> list = builder.threadlist;
            if (list == null) {
                this.threadlist = DEFAULT_THREADLIST;
            } else {
                this.threadlist = Message.immutableCopyOf(list);
            }
            this.theme_color = builder.theme_color;
            Boolean bool = builder.need_trans;
            if (bool == null) {
                this.need_trans = DEFAULT_NEED_TRANS;
                return;
            } else {
                this.need_trans = bool;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.avatar = builder.avatar;
        this.member_count = builder.member_count;
        this.thread_count = builder.thread_count;
        this.from = builder.from;
        this.threadlist = Message.immutableCopyOf(builder.threadlist);
        this.theme_color = builder.theme_color;
        this.need_trans = builder.need_trans;
    }
}
