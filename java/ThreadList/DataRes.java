package tbclient.ThreadList;

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
import tbclient.BannerList;
import tbclient.ThreadInfo;
import tbclient.User;
/* loaded from: classes5.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ASP_SHOWN_INFO = "";
    public static final String DEFAULT_PARTIAL_VISIBLE_TOAST = "";
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST;
    public static final List<User> DEFAULT_USER_LIST;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String asp_shown_info;
    @ProtoField(tag = 3)
    public final BannerList banner_list;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String partial_visible_toast;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> thread_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<User> user_list;

    /* loaded from: classes5.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String asp_shown_info;
        public BannerList banner_list;
        public String partial_visible_toast;
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
            this.thread_list = Message.copyOf(dataRes.thread_list);
            this.user_list = Message.copyOf(dataRes.user_list);
            this.banner_list = dataRes.banner_list;
            this.asp_shown_info = dataRes.asp_shown_info;
            this.partial_visible_toast = dataRes.partial_visible_toast;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataRes(this, z, null) : (DataRes) invokeZ.objValue;
        }
    }

    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(881483202, "Ltbclient/ThreadList/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(881483202, "Ltbclient/ThreadList/DataRes;");
                return;
            }
        }
        DEFAULT_THREAD_LIST = Collections.emptyList();
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
            List<ThreadInfo> list = builder.thread_list;
            if (list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = Message.immutableCopyOf(list);
            }
            List<User> list2 = builder.user_list;
            if (list2 == null) {
                this.user_list = DEFAULT_USER_LIST;
            } else {
                this.user_list = Message.immutableCopyOf(list2);
            }
            this.banner_list = builder.banner_list;
            String str = builder.asp_shown_info;
            if (str == null) {
                this.asp_shown_info = "";
            } else {
                this.asp_shown_info = str;
            }
            String str2 = builder.partial_visible_toast;
            if (str2 == null) {
                this.partial_visible_toast = "";
                return;
            } else {
                this.partial_visible_toast = str2;
                return;
            }
        }
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
        this.user_list = Message.immutableCopyOf(builder.user_list);
        this.banner_list = builder.banner_list;
        this.asp_shown_info = builder.asp_shown_info;
        this.partial_visible_toast = builder.partial_visible_toast;
    }
}
