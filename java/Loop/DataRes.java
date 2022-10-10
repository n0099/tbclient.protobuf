package tbclient.Loop;

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
import tbclient.AlaLiveInfo;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final List<AlaLiveInfo> DEFAULT_LIVE_FOLLOW_SECOND_FLOOR;
    public static final List<AlaLiveInfo> DEFAULT_LIVE_INDEX_SECOND_FLOOR;
    public static final List<AlaLiveInfo> DEFAULT_LIVE_PIC_SECOND_FLOOR;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3)
    public final IconRes icon;
    @ProtoField(tag = 2)
    public final LevelRes level;
    @ProtoField(tag = 1)
    public final LiveRes live;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<AlaLiveInfo> live_follow_second_floor;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<AlaLiveInfo> live_index_second_floor;
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<AlaLiveInfo> live_pic_second_floor;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public IconRes icon;
        public LevelRes level;
        public LiveRes live;
        public List<AlaLiveInfo> live_follow_second_floor;
        public List<AlaLiveInfo> live_index_second_floor;
        public List<AlaLiveInfo> live_pic_second_floor;

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
        public Builder(DataRes dataRes) {
            super(dataRes);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dataRes};
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
            if (dataRes == null) {
                return;
            }
            this.live = dataRes.live;
            this.level = dataRes.level;
            this.icon = dataRes.icon;
            this.live_follow_second_floor = Message.copyOf(dataRes.live_follow_second_floor);
            this.live_index_second_floor = Message.copyOf(dataRes.live_index_second_floor);
            this.live_pic_second_floor = Message.copyOf(dataRes.live_pic_second_floor);
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-280541978, "Ltbclient/Loop/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-280541978, "Ltbclient/Loop/DataRes;");
                return;
            }
        }
        DEFAULT_LIVE_FOLLOW_SECOND_FLOOR = Collections.emptyList();
        DEFAULT_LIVE_INDEX_SECOND_FLOOR = Collections.emptyList();
        DEFAULT_LIVE_PIC_SECOND_FLOOR = Collections.emptyList();
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
            this.live = builder.live;
            this.level = builder.level;
            this.icon = builder.icon;
            List<AlaLiveInfo> list = builder.live_follow_second_floor;
            if (list == null) {
                this.live_follow_second_floor = DEFAULT_LIVE_FOLLOW_SECOND_FLOOR;
            } else {
                this.live_follow_second_floor = Message.immutableCopyOf(list);
            }
            List<AlaLiveInfo> list2 = builder.live_index_second_floor;
            if (list2 == null) {
                this.live_index_second_floor = DEFAULT_LIVE_INDEX_SECOND_FLOOR;
            } else {
                this.live_index_second_floor = Message.immutableCopyOf(list2);
            }
            List<AlaLiveInfo> list3 = builder.live_pic_second_floor;
            if (list3 == null) {
                this.live_pic_second_floor = DEFAULT_LIVE_PIC_SECOND_FLOOR;
                return;
            } else {
                this.live_pic_second_floor = Message.immutableCopyOf(list3);
                return;
            }
        }
        this.live = builder.live;
        this.level = builder.level;
        this.icon = builder.icon;
        this.live_follow_second_floor = Message.immutableCopyOf(builder.live_follow_second_floor);
        this.live_index_second_floor = Message.immutableCopyOf(builder.live_index_second_floor);
        this.live_pic_second_floor = Message.immutableCopyOf(builder.live_pic_second_floor);
    }
}
