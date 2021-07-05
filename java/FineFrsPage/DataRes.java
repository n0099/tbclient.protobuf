package tbclient.FineFrsPage;

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
/* loaded from: classes10.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final List<EverydayThread> DEFAULT_EVERYDAY_THREAD;
    public static final List<FineBanner> DEFAULT_FINE_BANNER;
    public static final Integer DEFAULT_HAS_MORE;
    public static final List<Hot_Thread> DEFAULT_HOT_THREAD;
    public static final List<String> DEFAULT_TAG_LIST;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<EverydayThread> everyday_thread;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<FineBanner> fine_banner;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<Hot_Thread> hot_thread;
    @ProtoField(label = Message.Label.REPEATED, tag = 4, type = Message.Datatype.STRING)
    public final List<String> tag_list;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<EverydayThread> everyday_thread;
        public List<FineBanner> fine_banner;
        public Integer has_more;
        public List<Hot_Thread> hot_thread;
        public List<String> tag_list;

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
            this.fine_banner = Message.copyOf(dataRes.fine_banner);
            this.everyday_thread = Message.copyOf(dataRes.everyday_thread);
            this.has_more = dataRes.has_more;
            this.tag_list = Message.copyOf(dataRes.tag_list);
            this.hot_thread = Message.copyOf(dataRes.hot_thread);
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1581919714, "Ltbclient/FineFrsPage/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1581919714, "Ltbclient/FineFrsPage/DataRes;");
                return;
            }
        }
        DEFAULT_FINE_BANNER = Collections.emptyList();
        DEFAULT_EVERYDAY_THREAD = Collections.emptyList();
        DEFAULT_HAS_MORE = 0;
        DEFAULT_TAG_LIST = Collections.emptyList();
        DEFAULT_HOT_THREAD = Collections.emptyList();
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
            List<FineBanner> list = builder.fine_banner;
            if (list == null) {
                this.fine_banner = DEFAULT_FINE_BANNER;
            } else {
                this.fine_banner = Message.immutableCopyOf(list);
            }
            List<EverydayThread> list2 = builder.everyday_thread;
            if (list2 == null) {
                this.everyday_thread = DEFAULT_EVERYDAY_THREAD;
            } else {
                this.everyday_thread = Message.immutableCopyOf(list2);
            }
            Integer num = builder.has_more;
            if (num == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = num;
            }
            List<String> list3 = builder.tag_list;
            if (list3 == null) {
                this.tag_list = DEFAULT_TAG_LIST;
            } else {
                this.tag_list = Message.immutableCopyOf(list3);
            }
            List<Hot_Thread> list4 = builder.hot_thread;
            if (list4 == null) {
                this.hot_thread = DEFAULT_HOT_THREAD;
                return;
            } else {
                this.hot_thread = Message.immutableCopyOf(list4);
                return;
            }
        }
        this.fine_banner = Message.immutableCopyOf(builder.fine_banner);
        this.everyday_thread = Message.immutableCopyOf(builder.everyday_thread);
        this.has_more = builder.has_more;
        this.tag_list = Message.immutableCopyOf(builder.tag_list);
        this.hot_thread = Message.immutableCopyOf(builder.hot_thread);
    }
}
