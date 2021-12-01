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
import java.util.Collections;
import java.util.List;
/* loaded from: classes4.dex */
public final class RecomThreadList extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_CURRENT_PV;
    public static final String DEFAULT_RECOMMEND_DATE = "";
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST;
    public static final List<User> DEFAULT_USER_LIST;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long current_pv;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String recommend_date;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThreadInfo> thread_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<User> user_list;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<RecomThreadList> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long current_pv;
        public String recommend_date;
        public List<ThreadInfo> thread_list;
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
        public Builder(RecomThreadList recomThreadList) {
            super(recomThreadList);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {recomThreadList};
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
            if (recomThreadList == null) {
                return;
            }
            this.user_list = Message.copyOf(recomThreadList.user_list);
            this.thread_list = Message.copyOf(recomThreadList.thread_list);
            this.recommend_date = recomThreadList.recommend_date;
            this.current_pv = recomThreadList.current_pv;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecomThreadList build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new RecomThreadList(this, z, null) : (RecomThreadList) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1096534769, "Ltbclient/RecomThreadList;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1096534769, "Ltbclient/RecomThreadList;");
                return;
            }
        }
        DEFAULT_USER_LIST = Collections.emptyList();
        DEFAULT_THREAD_LIST = Collections.emptyList();
        DEFAULT_CURRENT_PV = 0L;
    }

    public /* synthetic */ RecomThreadList(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecomThreadList(Builder builder, boolean z) {
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
            List<User> list = builder.user_list;
            if (list == null) {
                this.user_list = DEFAULT_USER_LIST;
            } else {
                this.user_list = Message.immutableCopyOf(list);
            }
            List<ThreadInfo> list2 = builder.thread_list;
            if (list2 == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = Message.immutableCopyOf(list2);
            }
            String str = builder.recommend_date;
            if (str == null) {
                this.recommend_date = "";
            } else {
                this.recommend_date = str;
            }
            Long l = builder.current_pv;
            if (l == null) {
                this.current_pv = DEFAULT_CURRENT_PV;
                return;
            } else {
                this.current_pv = l;
                return;
            }
        }
        this.user_list = Message.immutableCopyOf(builder.user_list);
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
        this.recommend_date = builder.recommend_date;
        this.current_pv = builder.current_pv;
    }
}
