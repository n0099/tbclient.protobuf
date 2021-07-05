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
import tbclient.Post;
import tbclient.User;
/* loaded from: classes10.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Long DEFAULT_NEXTFTID;
    public static final List<Post> DEFAULT_POST_LIST;
    public static final Long DEFAULT_PREVFTID;
    public static final List<User> DEFAULT_USER_LIST;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long nextftid;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<Post> post_list;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long prevftid;
    @ProtoField(tag = 2)
    public final ForumInfo thread_info;
    @ProtoField(tag = 1)
    public final User_Info user_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<User> user_list;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long nextftid;
        public List<Post> post_list;
        public Long prevftid;
        public ForumInfo thread_info;
        public User_Info user_info;
        public List<User> user_list;

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
            this.user_info = dataRes.user_info;
            this.thread_info = dataRes.thread_info;
            this.prevftid = dataRes.prevftid;
            this.nextftid = dataRes.nextftid;
            this.post_list = Message.copyOf(dataRes.post_list);
            this.user_list = Message.copyOf(dataRes.user_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataRes(this, z, null) : (DataRes) invokeZ.objValue;
        }
    }

    /* loaded from: classes10.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-313607441, "Ltbclient/FinePbPage/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-313607441, "Ltbclient/FinePbPage/DataRes;");
                return;
            }
        }
        DEFAULT_PREVFTID = 0L;
        DEFAULT_NEXTFTID = 0L;
        DEFAULT_POST_LIST = Collections.emptyList();
        DEFAULT_USER_LIST = Collections.emptyList();
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
            this.user_info = builder.user_info;
            this.thread_info = builder.thread_info;
            Long l = builder.prevftid;
            if (l == null) {
                this.prevftid = DEFAULT_PREVFTID;
            } else {
                this.prevftid = l;
            }
            Long l2 = builder.nextftid;
            if (l2 == null) {
                this.nextftid = DEFAULT_NEXTFTID;
            } else {
                this.nextftid = l2;
            }
            List<Post> list = builder.post_list;
            if (list == null) {
                this.post_list = DEFAULT_POST_LIST;
            } else {
                this.post_list = Message.immutableCopyOf(list);
            }
            List<User> list2 = builder.user_list;
            if (list2 == null) {
                this.user_list = DEFAULT_USER_LIST;
                return;
            } else {
                this.user_list = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.user_info = builder.user_info;
        this.thread_info = builder.thread_info;
        this.prevftid = builder.prevftid;
        this.nextftid = builder.nextftid;
        this.post_list = Message.immutableCopyOf(builder.post_list);
        this.user_list = Message.immutableCopyOf(builder.user_list);
    }
}
