package tbclient.GetAddressList;

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
/* loaded from: classes5.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final List<listData> DEFAULT_ADDRESS_LIST;
    public static final List<deleteList> DEFAULT_DELETED_LIST;
    public static final List<robotsList> DEFAULT_ROBOTS_LIST;
    public static final Long DEFAULT_TIMESTAMP;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<listData> address_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<deleteList> deleted_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<robotsList> robots_list;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long timestamp;

    /* loaded from: classes5.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<listData> address_list;
        public List<deleteList> deleted_list;
        public List<robotsList> robots_list;
        public Long timestamp;

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
            this.address_list = Message.copyOf(dataRes.address_list);
            this.deleted_list = Message.copyOf(dataRes.deleted_list);
            this.timestamp = dataRes.timestamp;
            this.robots_list = Message.copyOf(dataRes.robots_list);
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1467063694, "Ltbclient/GetAddressList/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1467063694, "Ltbclient/GetAddressList/DataRes;");
                return;
            }
        }
        DEFAULT_ADDRESS_LIST = Collections.emptyList();
        DEFAULT_DELETED_LIST = Collections.emptyList();
        DEFAULT_TIMESTAMP = 0L;
        DEFAULT_ROBOTS_LIST = Collections.emptyList();
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
            List<listData> list = builder.address_list;
            if (list == null) {
                this.address_list = DEFAULT_ADDRESS_LIST;
            } else {
                this.address_list = Message.immutableCopyOf(list);
            }
            List<deleteList> list2 = builder.deleted_list;
            if (list2 == null) {
                this.deleted_list = DEFAULT_DELETED_LIST;
            } else {
                this.deleted_list = Message.immutableCopyOf(list2);
            }
            Long l = builder.timestamp;
            if (l == null) {
                this.timestamp = DEFAULT_TIMESTAMP;
            } else {
                this.timestamp = l;
            }
            List<robotsList> list3 = builder.robots_list;
            if (list3 == null) {
                this.robots_list = DEFAULT_ROBOTS_LIST;
                return;
            } else {
                this.robots_list = Message.immutableCopyOf(list3);
                return;
            }
        }
        this.address_list = Message.immutableCopyOf(builder.address_list);
        this.deleted_list = Message.immutableCopyOf(builder.deleted_list);
        this.timestamp = builder.timestamp;
        this.robots_list = Message.immutableCopyOf(builder.robots_list);
    }
}
