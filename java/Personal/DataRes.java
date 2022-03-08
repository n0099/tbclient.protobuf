package tbclient.Personal;

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
import tbclient.DealWindow;
import tbclient.DynamicInfo;
import tbclient.ForumDynamic;
import tbclient.ThreadInfo;
import tbclient.User;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final List<ForumDynamic> DEFAULT_CONCERNED_FORUM_LIST;
    public static final List<DynamicInfo> DEFAULT_DYNAMIC_LIST;
    public static final Integer DEFAULT_HAS_MORE;
    public static final Integer DEFAULT_PN;
    public static final List<ThreadInfo> DEFAULT_VIDEO_PAGE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<ForumDynamic> concerned_forum_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<DynamicInfo> dynamic_list;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 1)
    public final User user;
    @ProtoField(tag = 7)
    public final UserGodInfo user_god_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThreadInfo> video_page;
    @ProtoField(tag = 8)
    public final DealWindow window;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<ForumDynamic> concerned_forum_list;
        public List<DynamicInfo> dynamic_list;
        public Integer has_more;
        public Integer pn;
        public User user;
        public UserGodInfo user_god_info;
        public List<ThreadInfo> video_page;
        public DealWindow window;

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
        public Builder(DataRes dataRes) {
            super(dataRes);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dataRes};
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
            if (dataRes == null) {
                return;
            }
            this.user = dataRes.user;
            this.video_page = Message.copyOf(dataRes.video_page);
            this.dynamic_list = Message.copyOf(dataRes.dynamic_list);
            this.concerned_forum_list = Message.copyOf(dataRes.concerned_forum_list);
            this.pn = dataRes.pn;
            this.has_more = dataRes.has_more;
            this.user_god_info = dataRes.user_god_info;
            this.window = dataRes.window;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataRes(this, z, null) : (DataRes) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1290397238, "Ltbclient/Personal/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1290397238, "Ltbclient/Personal/DataRes;");
                return;
            }
        }
        DEFAULT_VIDEO_PAGE = Collections.emptyList();
        DEFAULT_DYNAMIC_LIST = Collections.emptyList();
        DEFAULT_CONCERNED_FORUM_LIST = Collections.emptyList();
        DEFAULT_PN = 0;
        DEFAULT_HAS_MORE = 0;
    }

    public /* synthetic */ DataRes(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataRes(Builder builder, boolean z) {
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
            this.user = builder.user;
            List<ThreadInfo> list = builder.video_page;
            if (list == null) {
                this.video_page = DEFAULT_VIDEO_PAGE;
            } else {
                this.video_page = Message.immutableCopyOf(list);
            }
            List<DynamicInfo> list2 = builder.dynamic_list;
            if (list2 == null) {
                this.dynamic_list = DEFAULT_DYNAMIC_LIST;
            } else {
                this.dynamic_list = Message.immutableCopyOf(list2);
            }
            List<ForumDynamic> list3 = builder.concerned_forum_list;
            if (list3 == null) {
                this.concerned_forum_list = DEFAULT_CONCERNED_FORUM_LIST;
            } else {
                this.concerned_forum_list = Message.immutableCopyOf(list3);
            }
            Integer num = builder.pn;
            if (num == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num;
            }
            Integer num2 = builder.has_more;
            if (num2 == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = num2;
            }
            this.user_god_info = builder.user_god_info;
            this.window = builder.window;
            return;
        }
        this.user = builder.user;
        this.video_page = Message.immutableCopyOf(builder.video_page);
        this.dynamic_list = Message.immutableCopyOf(builder.dynamic_list);
        this.concerned_forum_list = Message.immutableCopyOf(builder.concerned_forum_list);
        this.pn = builder.pn;
        this.has_more = builder.has_more;
        this.user_god_info = builder.user_god_info;
        this.window = builder.window;
    }
}
