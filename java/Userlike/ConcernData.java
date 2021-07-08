package tbclient.Userlike;

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
import tbclient.ThreadInfo;
import tbclient.User;
/* loaded from: classes9.dex */
public final class ConcernData extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_RECOM_TYPE;
    public static final List<User> DEFAULT_RECOM_USER_LIST;
    public static final Integer DEFAULT_SOURCE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2)
    public final PostData post_data;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer recom_type;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<User> recom_user_list;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer source;
    @ProtoField(tag = 1)
    public final ThreadInfo thread_list;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ConcernData> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public PostData post_data;
        public Integer recom_type;
        public List<User> recom_user_list;
        public Integer source;
        public ThreadInfo thread_list;

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
        public Builder(ConcernData concernData) {
            super(concernData);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {concernData};
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
            if (concernData == null) {
                return;
            }
            this.thread_list = concernData.thread_list;
            this.post_data = concernData.post_data;
            this.recom_type = concernData.recom_type;
            this.source = concernData.source;
            this.recom_user_list = Message.copyOf(concernData.recom_user_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ConcernData build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ConcernData(this, z, null) : (ConcernData) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1005888404, "Ltbclient/Userlike/ConcernData;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1005888404, "Ltbclient/Userlike/ConcernData;");
                return;
            }
        }
        DEFAULT_RECOM_TYPE = 0;
        DEFAULT_SOURCE = 0;
        DEFAULT_RECOM_USER_LIST = Collections.emptyList();
    }

    public /* synthetic */ ConcernData(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConcernData(Builder builder, boolean z) {
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
            this.thread_list = builder.thread_list;
            this.post_data = builder.post_data;
            Integer num = builder.recom_type;
            if (num == null) {
                this.recom_type = DEFAULT_RECOM_TYPE;
            } else {
                this.recom_type = num;
            }
            Integer num2 = builder.source;
            if (num2 == null) {
                this.source = DEFAULT_SOURCE;
            } else {
                this.source = num2;
            }
            List<User> list = builder.recom_user_list;
            if (list == null) {
                this.recom_user_list = DEFAULT_RECOM_USER_LIST;
                return;
            } else {
                this.recom_user_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.thread_list = builder.thread_list;
        this.post_data = builder.post_data;
        this.recom_type = builder.recom_type;
        this.source = builder.source;
        this.recom_user_list = Message.immutableCopyOf(builder.recom_user_list);
    }
}
